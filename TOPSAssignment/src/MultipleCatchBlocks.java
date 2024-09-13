package Exception;

public class MultipleCatchBlocks 
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        try {
            a[5] = 30 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds.");
        }
    }
}

