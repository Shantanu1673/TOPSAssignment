package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList 
{
    public static void main(String[] args)
    	{
    		ArrayList<String> list1 = new ArrayList<>();
    		list1.add("Apple");
    		list1.add("Banana");
    		list1.add("Orange");

    		ArrayList<String> list2 = new ArrayList<>(list1);
    		
    		System.out.println("List 1: " + list1);
    		System.out.println("List 2: " + list2);
    	}
}


