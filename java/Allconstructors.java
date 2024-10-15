class Car{
    int wheels = 4;
    Car(){     //no argument constructor
        int noOfDoors = 5;
        System.out.println(noOfDoors);
    }
    Car(String type){  // Parameterized Constructor
        System.out.println(type);
    }
}
class Allconstructors {
    public static void main(String[] args){
        Car c1 = new Car(); //check is constructor present else implicitly adds 
        Car c2 = new Car("Hybrid");
    }
}
