/*Class: StringCharacterPractice
Author: Sam Ismail
Date: 01/12/2024
Description: to create a method to output the squared value or a given number and a method to out put a message with a given name
 */
public class MethodPractice {
    public static void main(String[] args) {

        int square = calculateSquare(5);
        String hello = printName("Sam");

        System.out.println(square);
        System.out.println(hello);

    }

    public static int calculateSquare(int num){
        int square = num * num;
        return square;
    }

    public static String printName(String name){
        String hello = "Hello, " + name + "!";
        return hello;
    }


}
