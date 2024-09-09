package Collection;

import java.util.ArrayList;

public class ArrayListCompare 
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list2.add("Apple");
        list2.add("Banana");

        boolean isEqual = list1.equals(list2);
        System.out.println("Lists are equal: " + isEqual);
    }
}
