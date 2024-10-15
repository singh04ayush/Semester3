class Laptop{
    int ram;
    String ver;
    Laptop(){             //no argument constructor
        int x = 5;
        System.out.println(x);
    }
    void sysInfo(){
        System.out.println(ram);
        System.out.println(ver);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.ram = 16;
        l1.ver = "i5";
        l1.sysInfo();
    }
}
