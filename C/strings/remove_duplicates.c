#include <stdio.h>
#include <string.h>
int main(){
    char str[100]; scanf(" %[^\n]",str);
    int n=strlen(str), k=0;
    char res[100];
    for(int i=0;i<n;i++){
        int j; for(j=0;j<k;j++) if(str[i]==res[j]) break;
        if(j==k) res[k++]=str[i];
    }
    res[k]='\0';
    printf("%s",res);
}
