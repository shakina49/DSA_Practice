#include <stdio.h>
#define MAX 100

int queue[MAX];
int front=-1, rear=-1;

void enqueue(int x) {
    if(rear==MAX-1) { printf("Queue Overflow!\n"); return; }
    if(front==-1) front=0;
    queue[++rear]=x;
}

void dequeue() {
    if(front==-1 || front>rear) { printf("Queue Underflow!\n"); return; }
    printf("Dequeued: %d\n", queue[front++]);
    if(front>rear) front=rear=-1;
}

void display() {
    if(front==-1) { printf("Queue is empty\n"); return; }
    printf("Queue elements: ");
    for(int i=front;i<=rear;i++) printf("%d ", queue[i]);
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
