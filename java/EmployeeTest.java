class Employee { // Base class for all employees
    int empId; // Employee ID
    String name; // Employee Name
    Employee(String name, int empId) { // Parameterized constructor
        this.empId = empId;
        this.name = name;
    }
    int salarySum() { // Method to calculate salary (to be overridden by subclasses)
        return 0;
    }
}
class FullTime extends Employee { // FullTime employee subclass
    int salary;
    FullTime(String name, int empId, int salary) { // Constructor
        super(name, empId);
        this.salary = salary;
    }
    int salarySum() { // Overriding method to calculate salary
        return salary;
    }
}
class PartTime extends Employee { // PartTime employee subclass
    int hourRate, work; // attributes
    PartTime(String name, int empId, int hourRate, int work) { // Constructor
        super(name, empId);
        this.hourRate = hourRate;
        this.work = work;
    }
    int salarySum() { 
        return hourRate * work;
    }
}
class Intern extends Employee { // Intern employee subclass
    int stipend;
    Intern(String name, int empId, int stipend) { // Constructor
        super(name, empId);
        this.stipend = stipend;
    }
    int salarySum() { 
        return stipend;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        // Creating instances of different employee types
        Employee e1 = new FullTime("Ayush Singh", 1, 1258400);
        Employee e2 = new PartTime("Rishab", 2, 167, 75);
        Employee e3 = new Intern("Jitu", 3, 15000);
        // Displaying total salaries for each employee
        totalSalary(e1);
        totalSalary(e2);
        totalSalary(e3);
    }
    static void totalSalary(Employee e) { // Method to display the total salary
        int total = e.salarySum(); // Calculating total salary & printing salary with info
        System.out.println(e.name + ", " + e.empId + ", salary = " + total);
    }
}
