#include<stdio.h>
int main(){
    int arr[]={9,5,4,2,1};
    for(int i=0;i<5-1;i++){
        printf("%d and %d is: %d\n", arr[i],arr[i+1], arr[i]-arr[i+1]);
    }
    int a;
    int b;
    scanf("%d", &a);
    scanf("%d", &b);
    printf("%d",a+b);
}