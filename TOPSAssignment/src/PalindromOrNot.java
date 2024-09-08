package Array;
import java.util.Scanner;

public class PalindromOrNot
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=s1.nextInt();
		
	        int reversedNumber = 0;
	        int originalNumber = number;

	        while (number != 0)
	        {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        if (originalNumber == reversedNumber) 
	        {
	            System.out.println(originalNumber + " is a palindrome.");
	        }
	        else 
	        {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }
	        s1.close();
	    }	
	
}
