#include <stdio.h>
#define MAX 100

int stack[MAX];
int top=-1;

void push(int x) { if(top==MAX-1) { printf("Overflow!\n"); return; } stack[++top]=x; }

void display() {
    if(top==-1) { printf("Stack is empty\n"); return; }
    printf("Stack elements: ");
    for(int i=top;i>=0;i--) printf("%d ",stack[i]);
    printf("\n");
}

void reverse() {
    int start=0, end=top;
    while(start<end) {
        int temp=stack[start]; stack[start]=stack[end]; stack[end]=temp;
        start++; end--;
    }
}

int main() {
    int n, x;
    printf("Enter number of elements: "); scanf("%d",&n);
    for(int i=0;i<n;i++) { scanf("%d",&x); push(x); }
    printf("Original Stack:\n"); display();
    reverse();
    printf("Reversed Stack:\n"); display();
    return 0;
}
