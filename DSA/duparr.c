#include<stdio.h>
int main(){
    int arr[]={1,1,2,3,4,5,6,6};
    int n=8;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[j+1]){
                for(int k=j+1;k<n;k++){
                    arr[k]=arr[k+1];
                }
                n--;
            }
        }

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}