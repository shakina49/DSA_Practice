#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;

void insertEnd(int x) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->next = NULL;
    if(head==NULL) { head=temp; return; }
    struct Node* ptr=head;
    while(ptr->next!=NULL) ptr=ptr->next;
    ptr->next=temp;
}

void deleteNode(int x) {
    if(head==NULL){ printf("List is empty\n"); return; }
    struct Node* temp=head; struct Node* prev=NULL;
    while(temp!=NULL && temp->data!=x){ prev=temp; temp=temp->next; }
    if(temp==NULL){ printf("Element not found\n"); return; }
    if(prev==NULL) head=temp->next;
    else prev->next=temp->next;
    free(temp);
    printf("Deleted %d\n", x);
}

void display() {
    if(head==NULL){ printf("List is empty\n"); return; }
    struct Node* ptr=head;
    printf("Linked list: "); while(ptr!=NULL){ printf("%d ",ptr->data); ptr=ptr->next; } printf("\n");
}

int main() {
    int n,x;
    printf("Enter number of nodes: "); scanf("%d",&n);
    for(int i=0;i<n;i++){ scanf("%d",&x); insertEnd(x); }
    display();
    printf("Enter element to delete: "); scanf("%d",&x);
    deleteNode(x);
    display();
    return 0;
}
