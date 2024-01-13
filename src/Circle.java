public class Circle {
    public static void main(String[] args) {
        System.out.println(calculateArea(5));
        System.out.println(calculateArea(97));
        System.out.println(calculateArea(8));
}

    public static double calculateArea(int radius){
        double area = 3.14 * (radius * radius);
        return area;
    }
}
