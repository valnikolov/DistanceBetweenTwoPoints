import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coordinates of first point: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter coordinates of second point: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(
                (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
        );

        System.out.printf("Distance between the points: %.2f%n", distance);

    }

}
