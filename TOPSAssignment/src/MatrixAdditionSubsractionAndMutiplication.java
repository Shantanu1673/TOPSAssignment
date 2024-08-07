import java.util.Scanner;

public class MatrixAdditionSubsractionAndMutiplication
{
	public static void main(String[] args)
	{
	
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the number of rows: ");
		  int rows = scanner.nextInt();
		  System.out.print("Enter the number of columns: ");
		  int columns = scanner.nextInt();

		  int[][] m1 = new int[rows][columns];
		  int[][] m2 = new int[rows][columns];
		  System.out.println("Enter values for the first matrix:");
		       
		  for (int i = 0; i < rows; i++) 
		        {
				 	for (int j = 0; j < columns; j++)
				          {
				               System.out.print("Element [" + i + "][" + j + "]: ");
				               m1[i][j] = scanner.nextInt();
				           }
				 }
		  				System.out.println("Enter values for the second matrix:");
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print("Element [" + i + "][" + j + "]: ");
               m2[i][j] = scanner.nextInt();
		     }
		 }

		  int[][] resultMatrix = new int[rows][columns];
		        for (int i = 0; i < rows; i++)
				        {
				            for (int j = 0; j < columns; j++)
				            {
				                resultMatrix[i][j] = m1[i][j] + m2[i][j];
				            }
				        }
		        System.out.println("Resultant Matrix after addition:");
		        for (int i = 0; i < rows; i++) 
				        {
				            for (int j = 0; j < columns; j++) 
				            {
				                System.out.print(resultMatrix[i][j] + " ");
				            }
				            System.out.println();
				        }
		       
		        for (int i = 0; i < rows; i++)
				        {
				            for (int j = 0; j < columns; j++)
				            {
				                resultMatrix[i][j] = m1[i][j] - m2[i][j];
				            }
				        }
		        	System.out.println("Resultant Matrix after Substraction:");
		      for (int i = 0; i < rows; i++) 
				        {
				            for (int j = 0; j < columns; j++) 
				            {
				                System.out.print(resultMatrix[i][j] + " ");
				            }
				            System.out.println();
				        }
		        for (int i = 0; i < rows; i++)
		        {
		            for (int j = 0; j < columns; j++)
		            {
		                resultMatrix[i][j] = m1[i][j] * m2[i][j];
		            }
		        }
		      			System.out.println("Resultant Matrix after Multiplication:");
      	
      	     	for (int i = 0; i < rows; i++) 
		        {
		            for (int j = 0; j < columns; j++) 
		            {
		                System.out.print(resultMatrix[i][j] + " ");
		            }
		            System.out.println();
		        }

			
				        scanner.close();
	}
}
