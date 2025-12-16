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

void search(int x){
    struct Node* ptr=head;
    int pos=1, found=0;
    while(ptr!=NULL){
        if(ptr->data==x){ found=1; printf("Element found at position %d\n", pos); break; }
        ptr=ptr->next; pos++;
    }
    if(!found) printf("Element not found\n");
}

int main(){
    int n,x;
    printf("Enter number of nodes: "); scanf("%d",&n);
    for(int i=0;i<n;i++){ scanf("%d",&x); insertEnd(x); }
    printf("Enter element to search: "); scanf("%d",&x);
    search(x);
    return 0;
}
