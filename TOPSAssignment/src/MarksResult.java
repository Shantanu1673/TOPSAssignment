import java.util.Scanner;


public class MarksResult 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your marks:");
		int marks=s1.nextInt();
			if (marks >= 91 && marks <= 100)
			{
		            System.out.println("Grade: A");
		     } 
			else if (marks >= 81 && marks <= 90) 
			{
		            System.out.println("Grade: B");
	        }
			else if (marks >= 71 && marks <= 80)
			{
		            System.out.println("Grade: B");
		    }
			else if (marks >= 61 && marks <= 70)
			{
		            System.out.println("Grade: C");
		    }
			else if (marks >= 51 && marks <= 60) 
			{
		            System.out.println("Grade: D");
		    } 
			else if (marks >= 41 && marks <= 50)
			{
		            System.out.println("Grade: DD");
		    }
			else if (marks >= 0 && marks <= 40)
			{
		            System.out.println("Grade: Fail");
		     }
			else
			{
		            System.out.println("Invalid marks entered Please enter marks between 0 and 100");
		    }
		    
	}
}
