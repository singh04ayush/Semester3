
class Temperature{
    double cel, fah;
    double celToFah(double cel){
        return cel*9/5+32;
    }
    double fahToCel(double fah){
        return (fah-32)*5/9;
    }
    boolean checkTemp(double cel){
        if(cel==0) return true;
        else return false;
    }
}

class TempConverterTest {
    public static void main(String[] args){
        Temperature t1 = new Temperature();
        t1.fah = 32;
        double x = t1.fahToCel(t1.fah);
        System.out.println(x+" "+ t1.checkTemp(x));
    }
}
