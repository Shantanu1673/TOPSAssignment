package Exception;
public class CommandLineDivision
{
    public static void main(String[] args)
    {
        if (args.length < 2) 
        {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid number format.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Not enough arguments provided.");
        }
    }
}

