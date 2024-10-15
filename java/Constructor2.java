class Wifi{
    int ports, ref;
    String name;
    Wifi(int a, int b){    //parameterized 
        ports=a;
        ref=b;
    }
    int canConnect(int x){
        return x*2;
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Wifi w1 = new Wifi(4, 45433);
        w1.name = "hotspot";
        System.out.println(w1.ports + " "+ w1.ref + " "+ w1.canConnect(w1.ports));
        Wifi w2 = new Wifi(); //must pass argumnets
    }
}
