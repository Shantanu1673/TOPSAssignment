package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

       
        Collections.shuffle(list);

        System.out.println(list);
    }
}

