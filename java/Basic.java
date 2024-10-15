
class X{
    int abc(){
        return 5;
    }
}
class Y{
    
     int abc(){
        return 3;
     }
}
class Basic {
    public static void main(String[] args){
        X obj = new X();
        System.out.println(obj.abc(), obj.abc(5.6f));
    }

    int abc(float j){
        return 8;
    }
}
