package Collection;

import java.util.HashSet;

public class HashSetSize 
{
    public static void main(String[] args) 
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("Number of elements: " + hashSet.size());
    }
}

