import java.util.Scanner;
class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        if(x>=0){
            if(x==0) System.out.println("The Number is Zero");
            else System.out.println("The number is a positive integer");
        }
        else System.out.println("The number is a negative integer");
        sc.close();
    }
}



