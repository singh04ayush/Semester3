abstract class Figure{
    abstract void area();
}

class Square{
    int side;
    Square(int side){
        this.side=side;
    }
    void area(){
        System.out.println("Area of Square is: " + side*side);
    }
}

class Rectangle{
    double len, width;
    Rectangle(double len, double width){
        this.len=len;
        this.width=width;
    }
    void area(){
        System.out.println("Area of rectangle is: " + len*width);
    }
}

class AbstractTest{
    public static void main(String[] args){
        Square s1 = new Square(5);
        s1.area();
        Rectangle r1 = new Rectangle(20, 50.0);
        r1.area();
        // Rectangle f1 = new Figure();
        // f1.area();
    }
}