import java.util.Random;
class Booking{
    String roomtype;
    boolean roomService, inBreakfast;  //Bokking class attributes
    int roomNo; 
    static int bookingCount=0;  //keep track of bookings i.e why static not a instance variable
    final int maxBooking = 4;  //maximum allowed fixed using final
    
    Booking(String roomType){   //constructor for rooms with no roomservice and breakfast
        if(bookingCount < maxBooking){ //first checks if booking allowed or not
            this.roomtype=roomType;
            this.roomService=false;
            this.inBreakfast=false;
            bookingCount++;
        }
        else{
            System.out.println("Bookings fulled"); //if not display meassage
        }
        
    }
    Booking(String roomType, boolean roomService){ //constructor for rooms with roomservice but no breakfast
        if(bookingCount < maxBooking){
            this.roomtype=roomType;
            this.roomService=roomService;
            this.inBreakfast=false;
            bookingCount++;
        }
        else{
            System.out.println("Bookings fulled");
        }
    }
    Booking(String roomType, boolean roomService, boolean inBreakfast){ //constructor for rooms with roomservice and breakfast
        if(bookingCount < maxBooking){
            this.roomtype=roomType;
            this.roomService=roomService;
            this.inBreakfast=inBreakfast;
            bookingCount++;
        }
        else{
            System.out.println("Booking failed reached max bookings");
        }
    }
    boolean canBook(){ //for checking if we can book more or not
        if(bookingCount<maxBooking) return true;
        else return false;
    }
    int roomNumber(){ // gives room number based on room type
        Random r = new Random(); //using random class obj r to generate roomnumber 
        if(roomtype=="single"){
            int n = r.nextInt(99); //single rooms (0-99)
            return n;
        }
        else if(roomtype=="double"){
            int n = r.nextInt((100-1)+1); //double room (100-200)
            return n;
        }
        else{
            int n = r.nextInt((200-101)+1)+100; //other rooms (201-300)
            return n;
        }
        
    }
}
class BookingTest {
    public static void main(String[] args) {
        Booking b1 = new Booking("single"); //doing bookings of multiple cases
        Booking b2 = new Booking("single",true);
        Booking b3 = new Booking("double", true, true);
        Booking b4 = new Booking("suite ", false, true);
        System.out.println(b1.roomNumber()); // printing roonumber
        System.out.println(b3.roomNumber());
        System.out.println(b1.roomService); //single room roomservice not available
        System.out.println(b4.inBreakfast);
        System.out.println(b4.canBook()); //cheking current status of bookings
        Booking b5 = new Booking("suite",true, true); //gives error meassage
    }
}
