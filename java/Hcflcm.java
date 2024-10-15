import java.util.Scanner;
class Hcflcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("HCF is "+ x);
        sc.close();
    }
}
