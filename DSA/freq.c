#include<stdio.h>
int freq(int* arr, int x, int n){
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]==x)count+=1;
    }
    return count;
}
int main(){
    int arr[]={1,2,2,2,2,2,2,3,4,4,9,9};
    int n=10;
    for(int i=0;i<10;i++){
    if(arr[i+1]!=arr[i])printf("%d -> %d\n", arr[i], freq(arr, arr[i], n));
    }
    int a;
    printf("enter the number: ");
    scanf("%d", &a);
    int z=freq(arr, a, n);
    printf("frequency is -> %d", z);
    if(z>=n/2)printf("\nthe given number is majority");
    else printf("\ngiven number is not majority");
}








