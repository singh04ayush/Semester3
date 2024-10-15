import java.util.Scanner;
class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //sc is scanner class object, new is a operator
        System.out.print("Enter the temp. in celsius: ");
        float cel = sc.nextFloat();
        float far = cel*9/5+32;
        System.out.println(far);
        sc.close();
    }
}




