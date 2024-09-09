package Collection;

import java.util.HashSet;

public class HashSetToArray 
{
    public static void main(String[] args) 
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        String[] array = hashSet.toArray(new String[0]);
        for (String element : array)
        {
            System.out.println(element);
        }
    }
}

