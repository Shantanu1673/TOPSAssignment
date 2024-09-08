package Array;
import java.util.Scanner;

public class SecondMAx
{
	private static int j;

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
		System.out.println("]");
		
		
		int max=a[0];
		int secondmax=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
			System.out.println("Max number is "+max);
			
		for(int s=0;s<a.length;s++)
		{
			if(a[s]>secondmax && a[s]<max)
			{	
				secondmax=a[s];
			}
		}
		System.out.println("This is SecondMax Number : "+secondmax);
			
		sc.close();
		s1.close();		
	}
}
	