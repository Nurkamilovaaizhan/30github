import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
//        ternary operator
//        int score = 75;
//        String passOrFail = (score >= 60 ? "pass" : "fail");
//        System.out.println(passOrFail);

//        calculator
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        boolean valid = true;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operator: ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.print("Cannot divide by zero");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.print("Invalid operator");
                valid = false;
            }
        }

        if (valid) {
            System.out.println("\nResult: " + result);
        }

        sc.close();
    }
}
