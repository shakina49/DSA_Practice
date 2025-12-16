#include <stdio.h>
int main(){
    int n,key; scanf("%d",&n);
    int arr[n]; for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    printf("Enter key: "); scanf("%d",&key);
    int found=-1;
    for(int i=0;i<n;i++) if(arr[i]==key){ found=i; break; }
    if(found!=-1) printf("Found at index: %d",found);
    else printf("Not found");
}
