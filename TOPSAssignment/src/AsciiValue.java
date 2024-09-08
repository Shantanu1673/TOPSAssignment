package StringDemo;

import java.util.Scanner;

public class AsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		int ascii = (int) character;
		System.out.println("The ASCII value of '" + character + "' is: " + ascii);
	}
}

