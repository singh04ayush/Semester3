
class StringConcatenator{
    String first, second;
    String concatenate(){
        return first+" "+second;
    }
    boolean isSubstring(String x, String y){
        return x.contains(y);
    }
}

class StringConcatenatorTest {
    public static void main(String[] args){
        StringConcatenator s2 = new StringConcatenator();
        StringConcatenator s1;
        s1=s2;
        s1.first="Ayush";
        s1.second="Singh";
        String a = s1.concatenate();
        boolean b = s1.isSubstring(a, s1.second);
        System.out.println(a);
        System.out.println(b);
    }
}





