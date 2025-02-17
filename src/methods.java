public class methods {
    public static void main(String[] args) {

//        method - a block of reusable code that is executed when called ()

        String name = "Aizhan";
        int age =25;
        happyBirthday(name, age);
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s!", name);
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you\n");
    }
}
