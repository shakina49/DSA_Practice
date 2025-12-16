#include <stdio.h>
#include <string.h>
int isPalindrome(char str[], int i,int j){ if(i>=j) return 1; if(str[i]!=str[j]) return 0; return isPalindrome(str,i+1,j-1);}
int main(){ char str[100]; scanf(" %[^\n]",str); if(isPalindrome(str,0,strlen(str)-1)) printf("Palindrome"); else printf("Not Palindrome"); }
