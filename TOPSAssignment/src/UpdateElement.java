package Collection;

import java.util.ArrayList;

public class UpdateElement
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

    
        list.set(1, "Grapes");

        System.out.println(list);
    }
}

