public class TestTime {

    public static void main(String[] args) {

        // Create time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set times
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display original times
        System.out.println("Before Changes:");

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Apply changes
        t1.nextSecond();
        t2.previousSecond();

        // Display final times
        System.out.println("\nAfter Changes:");

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}