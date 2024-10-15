
class GradeCalculator{
    double math, java, os, cn;
    void printGrades(double num){
        if(num>=90) System.out.println("O");
        else if(num>=80) System.out.println("A");
        else if(num>=70) System.out.println("B+");
        else if(num>=60) System.out.println("B-");
        else if(num>=40) System.out.println("C");
        else System.out.println("F");
    }
    void avgGrade(){
        double x = (math+java+os+cn)/4;
        printGrades(x);
    }
}

public class GradeTest {
    public static void main(String[] args) {
        GradeCalculator g1 = new GradeCalculator();
        g1.math = 95.5;
        g1.java = 97;
        g1.cn = 91;
        g1.os = 55;
        g1.printGrades(g1.os);
        g1.avgGrade();
    }
}
