#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

void push(int x) {
    if(top==MAX-1) { printf("Overflow!\n"); return; }
    stack[++top]=x;
}

void peek() {
    if(top==-1) printf("Stack is empty\n");
    else printf("Top element: %d\n", stack[top]);
}

int main() {
    int n, x;
    printf("Enter number of elements: "); scanf("%d",&n);
    for(int i=0;i<n;i++) { scanf("%d",&x); push(x); }
    peek();
    if(top==-1) printf("Stack is empty\n"); else printf("Stack is not empty\n");
    return 0;
}
