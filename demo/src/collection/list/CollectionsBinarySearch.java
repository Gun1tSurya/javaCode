package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("K");
        list.add("F");
        list.add("J");
        list.add("a");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"J"));
        System.out.println(Collections.binarySearch(list,"F"));
    }
}
