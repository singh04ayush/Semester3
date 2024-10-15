class ShapeArea{ //class containing methods to calculate areas
    ShapeArea(String detail){ //parameterized constructor
        System.out.print(detail+" ");
    }
    int area(int len, int breadth){ 
        return len*breadth;
    }
    double area(double radius){ //same method name as previous but
        return 2*Math.PI*radius; // with different dataype
    }
    int area(int side){
        return side*side;
    }
    double area(int a, int b, int c){ //same method name as previous but
        int s = a+b+c/2;              //with different no. of arguments
        return Math.sqrt(s*(s-a)*(s-b)*(s-b));
    }
    float area(float base, float height){ //with different dataypes
        return base*height;
    }
}
class Shape {
    public static void main(String[] args) {
        ShapeArea s1 = new ShapeArea("Rectangle"); //s1 obj
        System.out.println(s1.area(5,7)); //method with 2 int dataypes will execute
        System.out.println("Triangle "+s1.area(3,4,5));//method with 3 int dataypes will execute
        ShapeArea s2 = new ShapeArea("Parllelogram"); //s2 obj
        System.out.println(s2.area(4.0f, 6.5f)); //method with 2 float dataype will execute
    }
}
