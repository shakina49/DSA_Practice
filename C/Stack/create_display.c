#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

void display() {
    if(top==-1) { printf("Stack is empty\n"); return; }
    printf("Stack elements: ");
    for(int i=top;i>=0;i--) printf("%d ",stack[i]);
    printf("\n");
}

int main() {
    int n, x;
    printf("Enter number of elements to push: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++) {
        printf("Enter element %d: ", i+1);
        scanf("%d",&x);
        if(top==MAX-1) printf("Overflow!\n");
        else stack[++top]=x;
    }
    display();
    return 0;
}
