import java.util.Scanner;
class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter the Opertaor: ");
        char op = sc.next().charAt(0);
        if(op=='+') System.out.println(x+y);
        else if (op=='-')System.out.println(x-y);
        else if(op=='*')System.out.println(x*y);
        else if(op=='/')System.out.println(x/y);
        else System.out.println("Invalid Opreator");
        sc.close();
    }
}









