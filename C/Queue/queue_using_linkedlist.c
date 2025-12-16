#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node *front=NULL, *rear=NULL;

void enqueue(int x) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->next = NULL;
    if(rear==NULL) { front=rear=temp; return; }
    rear->next = temp;
    rear = temp;
}

void dequeue() {
    if(front==NULL) { printf("Queue Underflow!\n"); return; }
    struct Node* temp = front;
    printf("Dequeued: %d\n", front->data);
    front = front->next;
    if(front==NULL) rear=NULL;
    free(temp);
}

void display() {
    if(front==NULL) { printf("Queue is empty\n"); return; }
    struct Node* temp = front;
    printf("Queue elements: ");
    while(temp!=NULL) { printf("%d ", temp->data); temp=temp->next; }
    printf("\n");
}

int main() {
    int choice, x;
    while(1) {
        printf("\n1.Enqueue 2.Dequeue 3.Display 4.Exit\nEnter choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1: printf("Enter element to enqueue: "); scanf("%d",&x); enqueue(x); break;
            case 2: dequeue(); break;
            case 3: display(); break;
            case 4: return 0;
            default: printf("Invalid choice\n");
        }
    }
}
