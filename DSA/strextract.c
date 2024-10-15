#include<stdio.h>
#include<string.h>
int main(){
    char s1[10]="Sharda";
    char s2[]="university";
    strcat(s1,s2);
    printf("concatentaed-> %s\n", s1 );
    char ex[]="";
    strncpy(ex, s1, 6);
    ex[6]='\0';
    printf("extracted-> %s", ex);

}