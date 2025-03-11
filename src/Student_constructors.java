public class Student_constructors {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student_constructors(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
    void study(){
        System.out.println(name + " is studying ");
    }

}
