package ExceptionHandlingBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultipleExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                System.out.println("Enter a numerator");
                int num = input.nextInt();
                System.out.println("Enter a denominator");
                int denominator = input.nextInt();

                int result = num / denominator;
                flag = false;
                System.out.println("the result of the division is " + result);

            } catch (ArithmeticException e) {
                System.out.println(e);
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e);
                input.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                input.nextLine();
            }

        }while (true) ;
    }
}
