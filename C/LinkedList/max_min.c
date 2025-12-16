#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* head=NULL;

void insertEnd(int x){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=x; temp->next=NULL;
    if(head==NULL){ head=temp; return; }
    struct Node* ptr=head;
    while(ptr->next!=NULL) ptr=ptr->next;
    ptr->next=temp;
}

void findMaxMin(){
    if(head==NULL){ printf("List is empty\n"); return; }
    int max=head->data, min=head->data;
    struct Node* ptr=head->next;
    while(ptr!=NULL){
        if(ptr->data>max) max=ptr->data;
        if(ptr->data<min) min=ptr->data;
        ptr=ptr->next;
    }
    printf("Maximum: %d\nMinimum: %d\n",max,min);
}

int main(){
    int n,x;
    printf("Enter number of nodes: "); scanf("%d",&n);
    for(int i=0;i<n;i++){ scanf("%d",&x); insertEnd(x); }
    findMaxMin();
    return 0;
}
