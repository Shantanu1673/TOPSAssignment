package Collection;

import java.util.ArrayList;

public class ArrayListJoin 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);
        System.out.println(list1);
    }
}

