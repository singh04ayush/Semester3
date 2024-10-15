// Base class for all employees
class Empolyee {
    int empId; // Employee ID
    String name; // Employee Name
    Empolyee(String name, int empId) { //parameterized constructor
        this.empId = empId; //argument is stored in 
        this.name = name;   //instance variable using this
    }
    int salarySum() { // Method to calculate salary
        return 0; 
    }
    int bonus(int val) { // Method to calculate a fixed bonus
        return val;
    }
    double bonus(int val, float percent) { // Overloading method for 
        return val * percent;              // percent based bonus
    }
}
class FullTime extends Empolyee { //subclass of Empolyee (polymorphism)
    int salary;
    FullTime(String name, int empId, int salary) { //constructor
        super(name, empId); //passing values to parent class attributes using super
        this.salary = salary;
    }
    int salarySum() {
        return salary;
    }
}
class PartTime extends Empolyee { //another subclass of Empolyee
    int hourRate, work; // Hourly rate and hours worked
    PartTime(String name, int empId, int hourRate, int work) { //constructor
        super(name, empId);
        this.hourRate = hourRate;
        this.work = work;
    }
    int salarySum() {
        return hourRate * work;
    }
}
class Freelancer extends Empolyee { //another subclass of Empolyee
    int fees;
    Freelancer(String name, int empId, int fees) { //constructor
        super(name, empId);
        this.fees = fees;
    }
    int salarySum() {
        return fees;
    }
}
class payroll {
    public static void main(String[] args) {
        // Creating instances of different employee types
        Empolyee e1 = new FullTime("Ayush Singh", 1, 1258400);
        Empolyee e2 = new Freelancer("Rishab", 2, 5000);
        Empolyee e3 = new PartTime("Jitu", 3, 167, 75);
        // Displaying total salaries and bonuses for each employee
        totalSalary(e1);
        totalSalary(e2);
        totalSalary(e3);
    }
    static void totalSalary(Empolyee e) { // Method to display the total salary and bonuses
        int total = e.salarySum(); // Calculating total salary
        System.out.println(e.name + ", " + e.empId + ", salary=" + total); // Printing employee details
        System.out.println("Fixed Bonus=" + e.bonus(1000) + ", Percent Bonus=" + e.bonus(total, 0.05f)); // Print bonuses
        System.out.println();
    }
}
