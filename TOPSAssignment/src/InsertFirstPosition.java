package Collection;

import java.util.ArrayList;

public class InsertFirstPosition 
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Orange");

        
        list.add(0, "Apple");

        System.out.println(list);
    }
}

