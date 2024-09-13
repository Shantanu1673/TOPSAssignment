package Exception;

public class NestedTryCatchBlocks
{
    public static void main(String[] args) 
    {
        int[] a = new int[5];
        try {
            try {
                a[5] = 30 / 0;  
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
                throw e;  
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Outer catch: General exception.");
        }
    }
}

