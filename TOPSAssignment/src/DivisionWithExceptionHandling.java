package Exception;

import java.util.Scanner;

public class DivisionWithExceptionHandling 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            float num1 = scanner.nextInt();
            float num2 = scanner.nextInt();
            float result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}


