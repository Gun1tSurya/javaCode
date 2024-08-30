package collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("B");
        h.add("A");
        h.add("P");
        h.add("C");
        h.add(10);
        h.add(null);
        System.out.println(h.add("P"));
        System.out.println(h);
    }
}
