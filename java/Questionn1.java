import java.util.Scanner;

class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the array elements
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
