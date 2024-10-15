#include<stdio.h>

int subarr(int* arr, int start, int end){
    int sum=0;
    for(int i=start;i<=end;i++){
        printf("%d ",arr[i]);
        sum+=arr[i];
    }
    return sum;
}
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int x = subarr(arr,2,7);
    printf("\nsum of subarray is: %d",x);
}