import java.util.Scanner;
/*Class: House
Author: Sam Ismail
Date: 01/26/2024
Description: to output and calculate the total number or paint needed for a room
 */
public class House {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of room");
        double length = input.nextDouble();

        System.out.println("Enter width of room");
        double width = input.nextDouble();

        System.out.println("Enter height of room");
        double height = input.nextDouble();

        System.out.println("Enter number of doors");
        double doors = input.nextDouble();

        System.out.println("Enter number of windows");
        double windows = input.nextDouble();

        double ceiling = length * width;
        double totalDoors = doors * 21;
        double totalWindows = windows * 15;
        double area = ((width * height * 4) + ceiling) - (totalWindows + totalDoors);
        double paint = area / 350;  //1 gallon of paint covers about 350 square feet,

        int wholeNumberOfGallons = (int)paint; //only whole number of gallons . this will be the gallon part
        double remainingGallonsInDouble = paint - wholeNumberOfGallons; //double value of gallons
        double quarts = remainingGallonsInDouble * 4;

        System.out.println("You will need " + wholeNumberOfGallons + " gallons of paint and " + Math.ceil(quarts) + " quarts of paint");

    }
}
