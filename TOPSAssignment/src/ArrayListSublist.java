package Collection;

import java.util.ArrayList;

public class ArrayListSublist 
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        ArrayList<String> sublist = new ArrayList<>(arrayList.subList(1, 4));
        System.out.println(sublist);
    }
}

