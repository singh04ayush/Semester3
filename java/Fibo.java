class Fibo {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);//taking first i.e 0th argument of String array of main function
        // converting this string into integer using parsing
        int a=0, b=1;
        n=n-2;
        System.out.print("Series using while loop: "+a+" "+b);
        while(n-->0){  //using this integer generating Fibo series 
            int c= a+b;        // with the help of while loop
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}




