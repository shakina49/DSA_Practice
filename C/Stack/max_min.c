#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

void push(int x) {
    if(top==MAX-1) { printf("Overflow!\n"); return; }
    stack[++top]=x;
}

int main() {
    int n, x;
    printf("Enter number of elements: "); scanf("%d",&n);
    for(int i=0;i<n;i++) { scanf("%d",&x); push(x); }

    if(top==-1) { printf("Stack is empty\n"); return 0; }

    int max=stack[0], min=stack[0];
    for(int i=1;i<=top;i++) {
        if(stack[i]>max) max=stack[i];
        if(stack[i]<min) min=stack[i];
    }
    printf("Maximum: %d\nMinimum: %d\n", max, min);
    return 0;
}
