package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Banana");
        list.add("Apple");

        Collections.sort(list);

        System.out.println(list);
    }
}
