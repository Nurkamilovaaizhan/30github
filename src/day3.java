import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
//        math

        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter the length of a: ");
        a = sc.nextDouble();
        System.out.print("Enter the length of b: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(a);
        System.out.println(b);
        System.out.println("The hypotenuse is: " + c);

        sc.close();
    }
}
