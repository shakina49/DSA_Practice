#include <stdio.h>
#include <string.h>
void reverse(char str[], int i, int j){ if(i>=j) return; char temp=str[i]; str[i]=str[j]; str[j]=temp; reverse(str,i+1,j-1);}
int main(){ char str[100]; scanf(" %[^\n]",str); reverse(str,0,strlen(str)-1); printf("%s",str);}
