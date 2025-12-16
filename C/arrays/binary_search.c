#include <stdio.h>
int main(){
    int n; scanf("%d",&n);
    int arr[n]; for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    int key; scanf("%d",&key);
    int l=0,r=n-1,found=-1;
    while(l<=r){
        int mid=(l+r)/2;
        if(arr[mid]==key){ found=mid; break; }
        else if(arr[mid]<key) l=mid+1;
        else r=mid-1;
    }
    if(found!=-1) printf("Found at index %d",found); else printf("Not found");
}
