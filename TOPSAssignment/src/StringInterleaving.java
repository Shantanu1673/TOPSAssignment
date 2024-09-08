package StringDemo;

public class StringInterleaving 
{
	 public static void main(String[] args)
	 {
		 String str1 = "WX";
		 String str2 = "YZ";
		 System.out.println("The given strings are: " + str1 + " " + str2);
		 System.out.println("The interleaving strings are: ");
		 
		 if (str1.isEmpty() && str2.isEmpty())
			 {
			     System.out.println("");
			 } 
		 else 
	        {
			 	String s1 = str1;
		        String s2 = str2;
	            String interleaved = "";
	            
	            while (true)
	            	{
	            		if (s1.length() == 0 && s2.length() == 0)
			                {
			                    break;
			                }

			                if (s1.length() > 0) 
			                {
			                    interleaved += s1.charAt(0);
			                    s1 = s1.substring(1);
			                }

			                if (s2.length() > 0)
			                {
			                    interleaved += s2.charAt(0);
			                    s2 = s2.substring(1);
			                }

			                System.out.println(interleaved);
			        }
	        }
	 }
}
 
