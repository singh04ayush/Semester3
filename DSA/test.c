#include<stdio.h>

int main(){
    int nums[]={-7,-6,-2,-1,2,3,5};
    int numsSize=7;
    int target=-2;
    int count = 0; // variable to store the count
    int left = 0; // variable to store the left
    int right = numsSize-1; // variable to store the right
    while(left < right){ // loop until left is less than right
        if(nums[left] + nums[right] < target){ // if nums[left] + nums[right] is less than target
            count+=right-left; // update the count
            left++; // increment the left
        }
        else{ // else
            right--; // decrement the right
        }
    }
    printf("%d",count);
}