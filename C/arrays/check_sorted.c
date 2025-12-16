#include <stdio.h>
int main(){
    int n; scanf("%d",&n); int arr[n]; for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    int asc=1,desc=1;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]) asc=0;
        if(arr[i]<arr[i+1]) desc=0;
    }
    if(asc) printf("Ascending"); else if(desc) printf("Descending"); else printf("Not sorted");
}
