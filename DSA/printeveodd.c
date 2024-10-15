#include<stdio.h>
int main(){
    int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
    printf("Even Numbers: ");
    for(int i=0;i<9;i++){
        if(arr[i]%2==0) printf(" %d", arr[i]);
        
    }
    printf("\nOdd Numbers: ");
    for(int i=0;i<9;i++){
        if(arr[i]%2!=0) printf(" %d", arr[i]);
        
    }
}

