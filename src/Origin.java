import java.util.Scanner;

public class Origin {
    // Constants are flexible if we ever want to check proximity to another coordinates.
    private static final int X_BASE = 0;
    private static final int Y_BASE = 0;

    // Declare distance.
    private static double _distance;



    public static void main(String[] args) {

        // Nearest coordinates uninitialized.
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
        _distance = getDistance(x1, y1);

        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        // Using math equation to calculate if second input's distance from base is less than prev distance.
        if(isGreaterThanDistance(x2, y2)) {
            nearest_x = x2;
            nearest_y = y2;
        }

        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        // Using math equation to calculate if third input's distance from base is less than prev distance.
        if(isGreaterThanDistance(x3, y3)) {
            nearest_x = x3;
            nearest_y = y3;
        }

        // Output the nearest x & y.
        System.out.printf("The nearest point to the origin is (%s,%s)\n", nearest_x, nearest_y);
    }

    /**
     * This method performs a math calculation of calculating a distance between two points on a graph.
     *
     * @param x a point on the x-axis
     * @param y a point on the y-axis
     * @return double
     */
    private static double getDistance(int x, int y) {
        return Math.sqrt(Math.pow(x - X_BASE, 2) + Math.pow(y - Y_BASE, 2));
    }

    /**
     * This method performs a math calculation and logically check if the calculation's
     * result is greater than the local private variable of distance.
     *
     * @param x a point on the x-axis
     * @param y a point on the y-axis
     * @return a boolean
     */
    private static boolean isGreaterThanDistance(int x, int y) {
        return getDistance(x, y) < _distance;
    }
}