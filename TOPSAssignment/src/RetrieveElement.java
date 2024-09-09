package Collection;
import java.util.ArrayList;

public class RetrieveElement
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);
    }
}

