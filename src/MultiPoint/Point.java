package MultiPoint;

public class Point {

        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        //public double distance(double x1, double y1, double x2, double y2) {

        public static double distance(Point p1 , Point p2){
            return Math.sqrt(Math.pow(p2.x - p1.x, 2) - Math.pow(p2.y - p1.y, 2));
        }

}
