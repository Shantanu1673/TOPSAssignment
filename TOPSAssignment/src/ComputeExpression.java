package StringDemo;

import java.util.Scanner;

public class ComputeExpression 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = scanner.nextInt();

	        
	        String strN = Integer.toString(n);
	        int nn = Integer.parseInt(strN + strN);
	        int nnn = Integer.parseInt(strN + strN + strN);

	        int result = n + nn + nnn;
	        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
	}
}
