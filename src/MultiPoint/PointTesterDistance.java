package MultiPoint;
import java.util.Scanner;

public class PointTesterDistance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y for 2 points a and b");
/*      double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        */


        Point p1 = new Point(scan.nextDouble(), scan.nextDouble());
        Point p2 = new Point(scan.nextDouble(), scan.nextDouble());

        double distanceFinal = Point.distance(p1, p2);

        public static void distancce(Point p1, Point p2){
            double distanceFinal = Point.distance(p1, p2);
            System.out.printf("The distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f", p1.getX(), p1.getY(), p2.getX(), p2.getY(), distanceFinal);
        }

    }
}
