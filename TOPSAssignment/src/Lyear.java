import java.util.Scanner;

public class Lyear	
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=s1.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("year is a leap year "+year);
		}
		else
		{
			System.out.println("year is not a leap year "+year);
		}
		s1.close();
	}
}
