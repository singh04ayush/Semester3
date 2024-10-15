#include <stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int maxSubArraySum(int arr[], int n) {
    int max_sum = 0;
    for (int i = 0; i < n - 2; i++) {
        int curr_sum = arr[i] + arr[i + 1] + arr[i + 2];
        max_sum = max(max_sum, curr_sum);
    }
    return max_sum;
}

int main() {
    int arr[] = {2, 3, 4, 5, 7};
    int n = sizeof(arr) / sizeof(arr[0]);
    int max_sum = maxSubArraySum(arr, n);
    printf("Maximum subarray sum of 3 elements is %d\n", max_sum);
    return 0;
}
