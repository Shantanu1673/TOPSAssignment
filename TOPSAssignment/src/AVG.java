import java.util.Scanner;

public class AVG	
{
	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		
		System.out.println("Enter First value:..");
		int a=value.nextInt();
		
		System.out.println("Enter Secong value:..");
		int b=value.nextInt();
	
		System.out.println("Enter Thired value:..");
		int c=value.nextInt();
		
		System.out.println("Enter Fourth value:..");
		int d=value.nextInt();
		
		System.out.println("Enter Fifth value:..");
		int e=value.nextInt();
	
		

		int f=a+b+c+d+e;
		int g=f/5;
		 System.out.println(f);
		 System.out.println(g);	
		 value.close();

	}
}
