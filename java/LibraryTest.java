class Book{
    String title, author;
    int year;                  //Book attributes or instance variables
    boolean available = true;
    Book(int year, String title, String author){  //Parameterized constructor
        this.year=year;
        this.title=title;    // assigning arguments value to instance
        this.author=author;  // variables using 'this' operator
    }
    boolean canBorrow(){   //method to borrow books
        if(available){
            available = false;
            return true;
        }
        return false;
    }
    String isOld(){    // method to check about publication
        if(year<2010) return "Old Publication";
        else return "New publication";
    }

}
class LibraryTest {
    public static void main(String[] args){
        Book b1 = new Book(2008, "OS Journal", "Mathew");
        //creating object b1 of class Book by passing values as argumnets
        System.out.println("Book: "+b1.title+", "+b1.author+", "+b1.year);
        //accessing attributes using dot opeartor
        System.out.println(b1.isOld());   
        System.out.println(b1.canBorrow());    // calling respective methods for object b1
        System.out.println(b1.canBorrow());
    }
}



