public class constructor {
    public static void main(String[] args) {

//        constructors - A special method to initialize objects
//                       You can pass arguments to a constructor
//                       and set up initial value
        Student_constructors student1 = new Student_constructors("Damon", 114, 3.5, false);
        Student_constructors student2 = new Student_constructors("Stefan", 110, 4.0, true);

        System.out.println(student1.name);
        System.out.println(student2.name);
        student1.study();
        student2.study();

    }
}
