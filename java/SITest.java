
class SIcalculation{
    double principal, rate;
    int time;
    double SIcalculator(){
        return principal*rate*time;
    }
}
class SITest {

    public static void main(String[] args){
        SIcalculation s1 = new SIcalculation();
        s1.principal=2000;
        SIcalculation s2;
        s2=s1;
        System.out.println(s2.principal);

    }
}
