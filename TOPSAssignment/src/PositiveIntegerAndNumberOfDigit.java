

import java.util.Scanner;

public class PositiveIntegerAndNumberOfDigit
{
	public static void main(String[] args)
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter number");
		int a=s1.nextInt();
		if(a<=0)
		{
			System.out.println("Number is Positive");
			
		}
		else
		{
			int b= 0;
            int c = a;
            
            
            while (c> 0) {
                c/= 10;             
                b++;
          }
            
            
            System.out.println("The number " + a+ " has " + b+ " digits.");
        
		
				
		}
		s1.close();

	}
}