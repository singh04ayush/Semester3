
import java.util.Scanner;  //importing scanner class from util package
class Calculator {  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // creating Scanner object sc 
        System.out.print("Enter First Operand: ");
        double x = sc.nextDouble();             // Scanning first number
        System.out.print("Enter the second operand: ");
        double y = sc.nextDouble();             // scanning second number
        System.out.print("Enter operaotr: ");
        char op = sc.next().charAt(0);    // scanning operator as char using charAt() function
        switch(op){ // applying each case using switch case syntax
            case '+':   // for addition
                System.out.println("Addition = " + (x+y));
                break;
            case '-':   //for subtarction
                System.out.println("Subtraction = " + (x-y));
                break;
            case '*':   //for multiplication
                System.out.println("Multiplication = " +(x*y));
                break;
            case '/':   //for division
                System.out.println("Division = " + (x/y));
                break;
            case '%':   //for remainder
                System.out.println("Remainder = " + (x%y));
                break;
            default:    //if user enters any other than these operators
                System.out.println("Invalid Operator");
        }
        sc.close(); // Scanner Stream is closed to avoid leaks
    }   
}








