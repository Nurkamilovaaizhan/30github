import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {

//        String name = "Aizhan";

//        int length = name.length();
//        int letter = name.charAt(3);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("i");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("z", "i");

//        name = name.isEmpty();
//        and other

//        day7
//        substring() - is a method used to extract a portion of a string
//          .substring(start, end);

//        String username = email.substring(0, 6);
git
//        email = "aizhan777@gmail.com";
//        username = email.substring(0, email.indexOf("@"));
//        domain = email.substring(email.indexOf("@") + 1);


//        String domain = email.substring(10);

        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;

        email = sc.nextLine();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Enter your email: ");
        email = sc.nextLine();

        System.out.println(email);

        sc.close();



    }
}
