class Rectangle{
    int length, breadth;
    int area(){
        return length*breadth;
    }
    boolean CheckSquare(){
        if(length==breadth) return true;
        else return false;
    }
}

class RectangleTest {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 5;
        System.out.println(r1.area());
        System.out.println(r1.CheckSquare());
    }
}
