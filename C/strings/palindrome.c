#include <stdio.h>
#include <string.h>
int main(){
    char str[100]; scanf(" %[^\n]",str);
    int n=strlen(str),flag=1;
    for(int i=0;i<n/2;i++) if(str[i]!=str[n-1-i]) flag=0;
    if(flag) printf("Palindrome"); else printf("Not Palindrome");
}
