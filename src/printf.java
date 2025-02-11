public class printf {
    public static void main(String[] args) {

//        printf() - is a method used to format output
//        %[flags][width][.precision][specifier-character]
        String name = "Stefan";
        char firstLetter = 'S';
        int age = 169;
        double height = 182.0;
        boolean isVampire = true;

        System.out.printf("My husband's name is: %s\n", name);
        System.out.printf("The name starts with: %c\n", firstLetter);
        System.out.printf("My husband's age is: %d\n", age);
        System.out.printf("He is %f inches tall \n", height);
        System.out.printf("Vampire: %b\n", isVampire);

        System.out.printf("%s is %d years old \n", name, age);
    }
}
