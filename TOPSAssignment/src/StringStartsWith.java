package StringDemo;

public class StringStartsWith
{
    public static void main(String[] args)
    {
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";
        String startString = "Red";

        System.out.println(str1 + " Starts with " + startString + "? :-> " + str1.startsWith(startString));
        System.out.println(str2 + " Starts with " + startString + "? :-> " + str2.startsWith(startString));
    }

}
