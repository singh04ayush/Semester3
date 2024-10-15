#include<stdio.h>

int main(){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    int flag=0;
    int subset[]={2,3,4,7};

    for(int i=0;i<4;i++){
        for(int j=0;j<11;j++){
            if(subset[i]==arr[j]) flag++;
        }
    }
    if(flag==4) printf("it is a subset");
    else printf("it is not a subset");  
}