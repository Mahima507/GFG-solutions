class Solution
{
    public:
    int getLength(node* head){
        int cnt=0;
        while(head!=NULL){
            cnt++;
            head=head->next;
        }
        return cnt;
    }
    struct node *reverse (struct node *head, int k)
    { 
        // Complete this method
        if(head==NULL){
            return NULL;
        }
        node *prev=NULL;
        node *current=head;
        node *temp;
        int cnt=1;
        while(current!=NULL&&cnt<=k){
            temp=current->next;
            current->next=prev;
            prev=current;
            current=temp;
            cnt++;
        }
        if(temp!=NULL){
            head->next=reverse(temp,k);
        }
        return prev;
    }
};
