package StringDemo;

import java.util.Scanner;

public class CharcCounter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s=sc.nextLine();
		
	    int letters = 0, spaces = 0, numbers = 0, others = 0;

	    for (char ch : s.toCharArray())
        {
            if (Character.isLetter(ch))
            {
                letters++;
            }
            else if (Character.isDigit(ch))
            {
                numbers++;
            } 
            else if (Character.isSpaceChar(ch))
            {
                spaces++;
            } 
            else
            {
                others++;
            }
        } 
	    
	    System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other Characters: " + others);
        sc.close();
	}
}
