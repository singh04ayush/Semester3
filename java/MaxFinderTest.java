
class MaxFinder{
    int num1, num2;
    boolean Max(int num1, int num2){
        if(num1>num2) return true;
        else return false;
    }
}

class MaxFinderTest {
    public static void main(String[] args){
        MaxFinder m1 = new MaxFinder();
        m1.num1 = 5;
        m1.num2 = 13;
        System.out.println(m1.Max(m1.num1, m1.num2));
    }
}

