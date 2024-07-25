import java.util.Scanner;

public class GratestNumber 
{
	public class GratestNumberFromAll 
	{
		public static void main(String[] args) 
		{
			
			Scanner number = new Scanner(System.in);
			
			
			System.out.println("Enter First number..");
			
			int a=number.nextInt();
			
			System.out.println("Enter Second number..");
			
			int b=number.nextInt();
			
			System.out.println("Enter Thired number..");
			
			int c=number.nextInt();
			
			if(a==b && b==c && c==a) 
			{
				System.out.println("All number are same "+a+" "+b+" "+c);
			}
			else if(a>b && a>c) 
			{
				System.out.println("Greatest number is "+a);
			}
			else if(b>a && b>c)
			{
				System.out.println("Greatest number is "+b);
			}
			else
			{
				System.out.println("Greatest number is "+c);
			}
			number.close();
			
		}
	}
}