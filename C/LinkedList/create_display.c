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
    if(head == NULL) {
        head = temp;
        return;
    }
    struct Node* ptr = head;
    while(ptr->next != NULL) ptr = ptr->next;
    ptr->next = temp;
}

void display() {
    if(head == NULL) { printf("List is empty\n"); return; }
    struct Node* ptr = head;
    printf("Linked list: ");
    while(ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

int main() {
    int n, x;
    printf("Enter number of nodes: "); scanf("%d",&n);
    for(int i=0;i<n;i++) {
        printf("Enter data for node %d: ", i+1);
        scanf("%d",&x);
        insertEnd(x);
    }
    display();
    return 0;
}
