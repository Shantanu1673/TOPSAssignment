package Collection;

import java.util.ArrayList;

public class ArrayListSwap 
{
    public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        
        String temp = arrayList.get(0);
        arrayList.set(0, arrayList.get(2));
        arrayList.set(2, temp);

        System.out.println(arrayList);
    }
}

