// class p1{
//     void say(){
//         System.out.println("parent 1");
//     }
// }

// class p2{
//     void say(){
//         System.out.pritnln("parent 2");
//     }
// }

// class c1 extends p1, p2{
//     public static void main(String[] args){
//         try{
//             c1 child1 = new c1();
//             c1.say();
//         } catch(Exception e){
//             System.out.println("error-> "+ e);
//         }
//     }
// }


//  diamond problem occurs as in case of multiple inheritance when extending more than one parent class, both parent class conatining a 
//  method with same method signature, the child class gets confuse which one to use


// solution can be given using interface which conatins abstarct method where we simply writes the method and compiler implcitliy declares
// it as abstarct method

interface P1{
    void say();
}

interface P2{
    void say();
}

class Child implements P1, P2{
    public void say(){
        System.out.println("hi bro");
    }
}

class Multiple{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.say();
    }
}