import java.util.Scanner;
class Questionn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int sal = sc.nextInt();
        System.out.print("Enter the performance evaluation rating: ");
        double rating = sc.nextDouble();
        if(sal<=0)System.out.println("Invalid Input");
        else{
            if(rating>=1 && rating<=3)System.out.println((int)(sal+0.1*sal));
            else if(rating>3 && rating<=4)System.out.println((int)(sal+0.25*sal));
            else if(rating>4 && rating<=5)System.out.println((int)(sal+0.3*sal));
            else System.out.println("Invalid Input");
        }
    }
}
