import java.util.Scanner;

public class SecondMAx
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the array's length:");
		int k=s1.nextInt();
		int[] a=new int[k];
	
		
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<k;j++)
		{
			System.out.print("enter the value for "+"["+j+"]"+":");
			a[j]=sc.nextInt();
		}
		System.out.print("[ ");
		for(int j=0;j<k;j++)
		{
			
			System.out.print(a[j]+" ");
		}
		System.out.print("]");
		
	
		sc.close();
		s1.close();
		
			
	}
}
	