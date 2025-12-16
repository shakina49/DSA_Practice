#include <stdio.h>
void rotateLeft(int arr[],int n,int d){
    for(int i=0;i<d;i++){
        int temp=arr[0];
        for(int j=0;j<n-1;j++) arr[j]=arr[j+1];
        arr[n-1]=temp;
    }
}
void rotateRight(int arr[],int n,int d){
    for(int i=0;i<d;i++){
        int temp=arr[n-1];
        for(int j=n-1;j>0;j--) arr[j]=arr[j-1];
        arr[0]=temp;
    }
}
int main(){
    int n,d; scanf("%d",&n);
    int arr[n]; for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    printf("Enter rotation count: "); scanf("%d",&d);
    rotateLeft(arr,n,d);
    printf("Left rotated: "); for(int i=0;i<n;i++) printf("%d ",arr[i]);
    rotateRight(arr,n,d);
    printf("\nRight rotated: "); for(int i=0;i<n;i++) printf("%d ",arr[i]);
}
