package Collection;

import java.util.HashMap;
import java.util.Collection;

public class HashMapValues 
{
    public static void main(String[] args)
    {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Apple");
        hashMap.put("2", "Banana");

        Collection<String> values = hashMap.values();
        System.out.println("Values in the map: " + values);
    }
}


