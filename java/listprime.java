
class listprime {
    static boolean isPrime(int n){//function to check numebr is prime or not
        if(n<=1) return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(args.length==0){ //in case no argument is passed through command line
            System.out.println("provide some arguments!");
            return;
        }
        for(String s : args){ // for every String argument in args 
            int num = Integer.parseInt(s); //parsing to get integer
            if(isPrime(num))System.out.print(num+" "); //if prime print to console
        }
    }
}








