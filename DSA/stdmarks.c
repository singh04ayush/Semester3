#include<stdio.h>
int main(){
    int n;
    printf("Enter number of student: ");
    scanf("%d", &n);
    int std[n][2];
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            printf("enter the details of %d student:", i+1);
            scanf("%d", &std[i][j]);
        }
    }
    printf("Roll No.    Marks\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            printf("%d          ", std[i][j]);
        }
        printf("\n");
    }
}