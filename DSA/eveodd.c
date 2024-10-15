#include<stdio.h>
int main(){
    int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9}, ecount=0, ocount=0;
    for(int i=0;i<9;i++){
        if(arr[i]%2==0)ecount++;
        else ocount++;
    }
    printf("Even Numbers: %d", ecount);
    printf("\nOdd Numbers: %d", ocount);

}

