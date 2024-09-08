package Array;
import java.util.Scanner;

public class MaxNumberFromArray 
{
	public static void main(String[] args) 
	{
		        Scanner s1 = new Scanner(System.in);

		        System.out.println("Enter the number of elements in the array:");
		        int n = s1.nextInt();
		        int[] a = new int[n];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) 
		        {
		            a[i] = s1.nextInt();
		              
		        }
		        System.out.print("[ ");
		        for (int i = 0; i < n; i++) 
		        {
		        	System.out.print(a[i]+" ");    
		        }
		        System.out.println("]");
		        System.out.println();
		        int max=a[0];
		        for(int i=0;i<a.length;i++)
		        {
		        	if(a[i]>max)
		        	{
		        		max=a[i];
		        	}
		        	
		        }
		        System.out.println("max number is "+max);
		        s1.close();
	}
}

  

