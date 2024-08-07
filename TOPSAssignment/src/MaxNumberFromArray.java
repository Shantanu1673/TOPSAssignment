import java.util.Scanner;

public class MaxNumberFromArray 
{
	public static void main(String[] args) 
	{
		        Scanner s1 = new Scanner(System.in);

		        System.out.println("Enter the number of elements in the array:");
		        int n = s1.nextInt();
		        int[] array = new int[n];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) 
		        {
		            array[i] = s1.nextInt();
		        }

		        int maxNumber = findMax(array);
		        System.out.println("The maximum number in the array is: " + maxNumber);
		    }

		    public static int findMax(int[] array) 
		    {
		        int max = array[0];
		        for (int i = 1; i < array.length; i++)
		        {
		            if (array[i] > max) 
		            {
		                max = array[i];
		            }
		        }
		        return max;
		    }
}

	

