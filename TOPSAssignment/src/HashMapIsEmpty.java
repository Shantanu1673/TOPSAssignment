package Collection;

import java.util.HashMap;

public class HashMapIsEmpty 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> hashMap = new HashMap<>();
        

        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);
    }
}

