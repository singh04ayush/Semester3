class Table{
    Table(int length, int breadth, String type){
        int area = length*breadth;
        System.out.println(area);
        System.out.println("i am in int");
    }
    Table (short length, short breadth){     //constructor overloading
        int area = length*breadth;
        System.out.println(area);
        System.out.println("in short");
    }
}
class diffConstructors {
    public static void main(String[] args) {
        byte a = 6;
        byte b = 7;
        Table t1 = new Table(a, b);
        
    }
}
