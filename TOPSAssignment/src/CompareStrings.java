package StringDemo;

public class CompareStrings
{
	public static void main(String[] args) 
	{
        String str1 = "topsint.com";
        String str2 = "topsint.com";
        String str3 = "Topsint.com";

        System.out.println("Comparing " + str1 + " and " + str2 + ": " + str1.equals(str2));
        System.out.println("Comparing " + str1 + " and " + str3 + ": " + str1.equals(str3));
    }
}
