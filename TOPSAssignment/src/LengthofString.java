package Array;
import java.util.Scanner;

public class LengthofString 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a String");
		String st=a.nextLine();
		
		int length=0;
		for(char ch : st.toCharArray())
		{
			length++;
		}
		System.out.println("Length of the String is : "+length);
		a.close();
		}
}
