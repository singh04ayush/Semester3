#include<stdio.h>
#include<stdlib.h>
int div(int n, int x){
    return n/x;
}
int main(){
    int arr[10]={3,4,9,5,6};
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i=size-1;i>=1;i--){
        arr[i]=arr[i-1];
    }
    arr[1]=7;
    for(int i=size-1;i>=6;i--){
        arr[i]=arr[i-1];
    }
    arr[6]=15;
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    int a = div(-2147483648, -1);
    printf("%d", a);

}