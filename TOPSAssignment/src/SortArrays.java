package Array;
import java.util.Scanner;

public class SortArrays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) 
        {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) 
        {
            array2[i] = scanner.nextInt();
        }

        System.out.print("Enter sorting order (1 for Descending & 2 for Ascending ): ");
        int order = scanner.nextInt();
        int temp=0;
        if(order==1)
        {
           for(int k=0;k<array1.length;k++)
        	{
        		for(int m=k+1;m<array1.length;m++)
        		{
        			if(array1[k]<array1[m])
        			{
        				temp=array1[k];
        				array1[k]=array1[m];
        				array1[m]=temp;
        			}
        		}
        	}
           System.out.println("Ascending Order First array :");
           for (int i = 0; i < size; i++) 
           {
               System.out.print(array1[i]+" ");;
           }
          
           for(int k=0;k<array2.length;k++)
        	{
        		for(int m=k+1;m<array2.length;m++)
        		{
        			if(array2[k]<array2[m])
        			{
        				temp=array2[k];
        				array2[k]=array2[m];
        				array2[m]=temp;
        			}
        		}
        	}
           System.out.println();
        
           System.out.println("Ascending Order Second array :");
           for (int i = 0; i < size; i++) 
           {
               System.out.print(array2[i]+" ");;
           }
        }
        
        else
        {
        	
        	for(int k=0;k<array1.length;k++)
        	{
        		for(int m=k+1;m<array1.length;m++)
        		{
        			if(array1[k]>array1[m])
        			{
        				temp=array1[k];
        				array1[k]=array1[m];
        				array1[m]=temp;
        			}
        		}
        	}
        	System.out.println("Descending Order First array :");
            for (int i = 0; i < size; i++) 
            {
                System.out.print(array1[i]+" ");;
            }
            System.out.println();
        	
        	for(int k=0;k<array2.length;k++)
        	{
        		for(int m=k+1;m<array2.length;m++)
        		{
        			if(array2[k]>array2[m])
        			{
        				temp=array2[k];
        				array2[k]=array2[m];
        				array2[m]=temp;
        			}
        		}
        	}
        	System.out.println("Descending Order Second array :");
            for (int i = 0; i < size; i++) 
            {
                System.out.print(array2[i]+" ");;
            }
        }
    }
    
}

