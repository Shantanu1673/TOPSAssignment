import java.util.Scanner;

public class AP2 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number from where you want to start pyramid");
		int cn=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter number of row you want pyramid");
		int k=s1.nextInt();
	
	 
	for(int i=1;i<=k;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(cn);
			cn++;
		}
		System.out.println();
		}
		s1.close();
		s2.close();
	}

}
