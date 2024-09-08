package StringDemo;

public class StringEndsWith
{
	 public static void main(String[] args)
	 {
	        String str1 = "Java Exercises";
	        String str2 = "Java Exercise";
	        String ending = "se";

	        System.out.println("\"" + str1 + "\" ends with \"" + ending + "\"? :-> " + str1.endsWith(ending));
	        System.out.println("\"" + str2 + "\" ends with \"" + ending + "\"? :-> " + str2.endsWith(ending));
	 }
}
