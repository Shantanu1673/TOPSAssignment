package Collection;

import java.util.HashMap;

public class HashMapSize 
{
    public static void main(String[] args)
    {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Apple");
        hashMap.put("2", "Banana");

        System.out.println("Number of mappings: " + hashMap.size());
    }
}

