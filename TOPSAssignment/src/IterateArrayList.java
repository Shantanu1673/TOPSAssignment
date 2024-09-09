package Collection;

import java.util.ArrayList;

public class IterateArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

 
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

