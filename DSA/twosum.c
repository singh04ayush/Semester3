#include<stdio.h>
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    int k=9;
    for(int i=0;i<11/2-1;i++){
        for(int j=1;j<11;j++){
            if(arr[i]+arr[j]==9)printf("Found At: %d %d, variables are %d and %d\n",i, j, arr[i], arr[j]);
        }
    }
}