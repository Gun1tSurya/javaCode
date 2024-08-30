package collection.list;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> names = Arrays.asList("Nitin","Gunwant","Mayuri");
        arrayList.add("Nitin");
        arrayList.add("Gunwant");
        arrayList.add("Stephy");
        arrayList.add("Mayuri");
        arrayList.add("Shweta");

        Collections.sort(names);
        System.out.println(names);

        //Reverse the sorted list
        names.sort(Comparator.comparing(String::toString).reversed());
        System.out.println("First method Reversing Sorting list"+ names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Second method Reversing Sorting list"+ names);

        names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Third method Using Stream:" + names);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        List<Object> objects = null;
        doSomething(objects);

    }

    private static void doSomething(List<Object> objects) {
        objects.add(new Integer(123));
    }

    List<String> stringList = new ArrayList<>();
}
