package Collection;

import java.util.HashSet;

public class HashSetIteration
{
    public static void main(String[] args) 
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        for (String element : hashSet)
        {
            System.out.println(element);
        }
    }
}

