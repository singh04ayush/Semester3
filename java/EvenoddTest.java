
class EvenOdd{
    int num;
    String toCheck(double num){
        if(num%2==0) return "Even";
        else return "Odd";
    }

    boolean isPrime(int num){
        if(num<1) return false;
        else if(num==2) return true;
        else{
            for(int i=2;i<num;i++){
                if(num%i==0)return false;
            }
            return true;
        }
    }
}

class evenoddTest {
    public static void main(String[] args) {
        EvenOdd n1 = new EvenOdd();
        n1.num = 12;
        System.out.println(n1.toCheck(n1.num));
        System.out.println(n1.isPrime(n1.num));
    }
}
