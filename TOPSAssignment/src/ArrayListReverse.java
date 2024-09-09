package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse 
{
    public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}

