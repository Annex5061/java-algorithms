#include<bits/stdc++.h>
using namespace std;
struct Node{
int data;
Node *next;
Node *prev;
};
void insertAtHead(Node **head_ref ,int mydata)
{
   Node* temp=new Node();
   temp->data=mydata;
   temp->next=*head_ref;
   temp->prev=NULL;
   if(*head_ref!=NULL)
   {
    (*head_ref)->prev=temp;
   }
   
   (*head_ref)=temp;

}
void print(Node*head)
{
    Node*temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
int main(){
    Node*head=NULL;
    insertAtHead(&head,2);
    insertAtHead(&head,5);
    insertAtHead(&head,7);
    insertAtHead(&head,11);
    print(head);

    return 0;
}