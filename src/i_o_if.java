import java.util.Scanner;

public class i_o_if {
    public static void main(String[] args) {
        /*day 2*/
//       if statements
        Scanner scn = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = scn.nextInt();
        if (age >= 18){
            System.out.println("You are an adult");
        } else if (age < 0){
            System.out.println("U have`nt been born yet");
        }
        else{
            System.out.println("molokosos");
        }
        scn.close();
    }
}
/*day1*/
//        output
//        System.out.println("Hello World");
//        input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        in one line "printIn without ln"
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your age is " + age);
//        System.out.println("Your gpa is " + gpa);
//        System.out.println("Is student? " + isStudent);
//        scanner.close();




