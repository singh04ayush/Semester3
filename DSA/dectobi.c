#include<stdio.h>

void decToBinary(int n){
    if( n<0 || n>255){
        printf("Invalid Ip");
        return;
    }
    int bin[8]={0};
    for(int i=7;i>=0;i--){
        bin[i]= n%2;
        n/=2;
    }
    for(int i=0;i<8;i++){
        printf("%d", bin[i]);
    }
    printf(".");

}

int main(){
    int ip[4];
    printf("Enter the ip address: ");
    for(int i=0;i<4;i++){
        scanf("%d", &ip[i]);
        decToBinary(ip[i]);
    }
}