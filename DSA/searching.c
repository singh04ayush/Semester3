#include<stdio.h>
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    int k=9, flag=0;
    for(int i=0;i<11;i++){
        if(arr[i]==k)flag=1;
    }
    if(flag==0)printf("FALSE");
    else printf("TRUE");

}