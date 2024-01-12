import java.util.Scanner;

/*Class: StringCharacterPractice
Author: Sam Ismail
Date: 01/12/2024
Description: to output the sum of all numbers user entered until user enters a negative number
 */
public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();
        int sum = num;

        while (num > 0) {
            System.out.println("Enter a number:");
            num = input.nextInt();

            if (num > 0) {
                sum = sum + num;
            }
        }
        if (num < 0){
            System.out.println(sum);
        }


    }
}
