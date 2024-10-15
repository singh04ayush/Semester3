import java.util.*;
class Student{
    String name;
    int sysId;
    final int maxCourse = 3;
    List<Course> registeredCourses;
    Student(String name, int sysId){
        this.name=name;
        this.sysId=sysId;
        this.registeredCourses = new ArrayList<>();
    }
    boolean registerCourse(Course c){
        if(registeredCourses.size()<maxCourse){
            registeredCourses.add(c);
            return true;
        }
        else{
            System.out.println("Can't Register more than "+maxCourse+" Courses");
            return false;
        }
    }
    void studentDetails(){
        System.out.println(name+" "+sysId+" "+ registeredCourses);
    }
}
class Course{
    String courseName, courseId;
    Course(String courseName, String courseId){
        this.courseName=courseName;
        this.courseId=courseId;
        
    }
    void courseDetails(){
        System.out.println(courseName+" "+ courseId);
    }
    @Override
    public String toString() {
        return courseName + " (" + courseId + ")";
    }
}
class CRS {
    public static void main(String[] args) {
        Course c1 = new Course("Java", "CSE101");
        Course c2 = new Course("C++", "CSE102");
        Course c3 = new Course("ADSA", "CSE103");
        Course c4 = new Course("Math", "CSE104");
        Student s1 = new Student("Ayush", 202305161);
        s1.registerCourse(c1);
        s1.registerCourse(c2);
        s1.registerCourse(c3);
        s1.registerCourse(c4);
        s1.studentDetails();
    }
}
