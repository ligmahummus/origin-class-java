import java.util.Scanner;


public class Origin {
    public static void main(String[] args) {
        // Constants are flexible if we ever want to check proximity to another coordinates.
        final int X_BASE = 0;
        final int Y_BASE = 0;

        // Declare distance.
        double distance;

        // Declare the nearest coordinates that'll be parsed as the answer at the end.
        int nearest_x;
        int nearest_y;

        // Scanner object.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first point coordinates:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        // First input is initialized as the nearest coordinates set.
        nearest_y = y1;
        nearest_x = x1;

        // Assigning the first input's calculation since there is nothing initialized
        // to _distance variable.
        distance = Math.sqrt(Math.pow(x1 - X_BASE, 2) + Math.pow(y1 - Y_BASE, 2));

        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        // Using math equation to calculate if second input's distance from base is less than prev distance.
        if(Math.sqrt(Math.pow(x2 - X_BASE, 2) + Math.pow(y2 - Y_BASE, 2)) < distance) {
            nearest_x = x2;
            nearest_y = y2;
        }

        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        // Using math equation to calculate if third input's distance from base is less than prev distance.
        if(Math.sqrt(Math.pow(x3 - X_BASE, 2) + Math.pow(y3 - Y_BASE, 2)) < distance) {
            nearest_x = x3;
            nearest_y = y3;
        }

        // Output the nearest x & y.
        System.out.printf("The nearest point to the origin is (%s,%s)\n", nearest_x, nearest_y);
    }
}