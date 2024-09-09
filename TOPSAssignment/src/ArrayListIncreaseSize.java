package Collection;

import java.util.ArrayList;

public class ArrayListIncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");

        arrayList.ensureCapacity(10); 
        arrayList.add("Cherry");
        arrayList.add("Date");

        System.out.println(arrayList);
    }
}

