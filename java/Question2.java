import java.util.Scanner;
class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println(x%2==0?"the number is even" : "the number is odd"); //using ternary operator(?)
        sc.close();
    }
}
