import java.util.Scanner;

public class Origin {
    public static void main(String[] args) {

        // Constants are flexible if we ever want to check proximity to another coordinates.

        // Nearest coordinates are not initialized.
        int nearest_x;
        int nearest_y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first point coordinates:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        // First input is initialized as the nearest coordinates set.
        nearest_y = y1;
        nearest_x = x1;

        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        // Condition if second input's coordinates are equal or less and update nearest x & y.
        if(Math.abs(x2) <= Math.abs(nearest_x) && Math.abs(y2) <= Math.abs(nearest_y)) {
            nearest_x = x2;
            nearest_y = y2;
        }

        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        // Condition if second input's coordinates are equal or less and update nearest x & y.
        if(Math.abs(x3) <= Math.abs(nearest_x) && Math.abs(y3) <= Math.abs(nearest_y)) {
            nearest_x = x3;
            nearest_y = y3;
        }

        // Output the nearest x & y.
        System.out.printf("The nearest point to the origin is (%s,%s)\n", nearest_x, nearest_y);
    }
}