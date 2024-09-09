package Collection;

import java.util.HashSet;

public class AppendToHashSet
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");

        set.add("Orange");

        System.out.println(set);
    }
}
