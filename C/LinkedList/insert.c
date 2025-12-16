#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* head=NULL;

void insertBeginning(int x){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=x; temp->next=head; head=temp;
}

void insertEnd(int x){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=x; temp->next=NULL;
    if(head==NULL){ head=temp; return; }
    struct Node* ptr=head;
    while(ptr->next!=NULL) ptr=ptr->next;
    ptr->next=temp;
}

void insertAtPos(int x,int pos){
    if(pos==1){ insertBeginning(x); return; }
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=x;
    struct Node* ptr=head;
    for(int i=1;i<pos-1 && ptr!=NULL;i++) ptr=ptr->next;
    if(ptr==NULL){ printf("Position out of range\n"); free(temp); return; }
    temp->next=ptr->next;
    ptr->next=temp;
}

void display(){
    if(head==NULL){ printf("List is empty\n"); return; }
    struct Node* ptr=head;
    printf("Linked list: "); while(ptr!=NULL){ printf("%d ",ptr->data); ptr=ptr->next; } printf("\n");
}

int main(){
    int n,x,pos;
    printf("Enter number of nodes to insert: "); scanf("%d",&n);
    for(int i=0;i<n;i++){ scanf("%d",&x); insertEnd(x); }
    display();
    printf("Enter element to insert at beginning: "); scanf("%d",&x); insertBeginning(x); display();
    printf("Enter element to insert at end: "); scanf("%d",&x); insertEnd(x); display();
    printf("Enter element and position to insert: "); scanf("%d%d",&x,&pos); insertAtPos(x,pos); display();
    return 0;
}
