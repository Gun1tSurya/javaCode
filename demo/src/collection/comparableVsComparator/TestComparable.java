package collection.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {

        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Dell",8,40000));
        list.add(new Laptop("Apple",16,60000));
        list.add(new Laptop("HP",8,39000));

        Collections.sort(list);

        for (Laptop s:list) {
            System.out.println(s);
        }
    }
}
