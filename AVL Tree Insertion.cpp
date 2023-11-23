unordered_map<Node*, int> height;

class Solution{
  public:
    Node * leftrotate(Node * node){
        Node * toreturn = node -> right;
        
        node -> right = toreturn -> left;
        toreturn -> left = node;
        
        return toreturn;
    }
    
    Node * rightrotate(Node * node){
        Node * toreturn = node -> left;
        
        node -> left = toreturn -> right;
        toreturn -> right = node;
        
        return toreturn;
    }
    
    /*You are required to complete this method */
    Node* insertToAVL(Node* node, int data)
    {
        if(node == nullptr){
            Node * newnode = new Node(data);
            height[newnode] = 1;
            return newnode;
        }
        
        if(data < node -> data)
            node -> left = insertToAVL(node -> left, data);
        else
            node -> right = insertToAVL(node -> right, data);
            
        auto he = [&](Node * node) -> int {
            if(node == nullptr)
                return 0;
                
            return height[node] = max(height[node -> left], height[node -> right]) + 1;
        };    
            
        int bf = he(node -> left) - he(node -> right);
        
        if(abs(bf) > 1){
            if(bf < 0){
                // right imbalance
                
                if(data < (node -> right) -> data){
                    // right - left imbalance
                    
                    node -> right = rightrotate(node -> right);
                    node = leftrotate(node);
                }
                else{
                    // right - right imbalance
                    
                    node = leftrotate(node);
                }
            }
            else{
                // left imbalance
                
                if(data < (node -> left) -> data){
                    // left - left imbalance
                    
                    node = rightrotate(node);
                }
                else{
                    // left - right imbalance
                    
                    node -> left = leftrotate(node -> left);
                    node = rightrotate(node);
                }
            }
            
            he(node);
            he(node -> left);
            he(node -> right);
        }
        
        return node;
    }
};
