public class Car {
        String make = "Porsche";
        String model = "Turbo S";
        int year = 2018;
        double price = 500000;
        boolean isRunning = true;

        void start() {
                isRunning = true;
            System.out.println("You start the engine");
        }
        void stop() {
                isRunning = false;
                System.out.println("You stop the engine");
        }
}
