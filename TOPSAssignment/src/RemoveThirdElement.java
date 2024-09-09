package Collection;
import java.util.ArrayList;

public class RemoveThirdElement 
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

       
        list.remove(2);

        System.out.println(list);
    }
}

