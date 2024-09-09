package Collection;

import java.util.ArrayList;

public class SearchElement 
{
    public static void main(String[] args)
    
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
  
        String searchElement = "Banana";
        boolean found = list.contains(searchElement);

        System.out.println(searchElement + " found: " + found);
    }
}

