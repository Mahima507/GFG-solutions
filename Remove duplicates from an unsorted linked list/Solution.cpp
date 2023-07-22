class Solution
{
    public:
    //Function to remove duplicates from unsorted linked list.
    Node * removeDuplicates( Node *head) 
    {
     // your code goes here
     map<int,bool>mp;
     Node* tmp=head;
     Node* t=tmp;
     while(tmp!=NULL){
        if(mp[tmp->data]==false)
        {
            mp[tmp->data]=true;
            t=tmp; 
            tmp=tmp->next;
        }
        else{
            Node* del=t->next;
            delete(del);
            t->next=tmp->next;
            tmp=tmp->next;
        }
     }
     return head;
    }
};
