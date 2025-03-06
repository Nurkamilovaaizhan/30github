public class varargs {
    public static void main(String[] args) {

//        varargs = allow a method to accept a varyung # of arguments
//        makes methods more flexible, no need for overloadeed methods
//        ... (ellipsis)

        System.out.println(average(1, 2, 3, 8, 9));
    }
    static double average(double ... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
