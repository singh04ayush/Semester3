import java.util.Scanner;
class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1.charAt(4));
        System.out.println(s2.contains(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        sc.close();
    }
}