package collection.set;

import java.util.LinkedHashSet;

/*
LinkedHashset is used when you don't want duplicates data to be stored and maintain the sequence
 */

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mayuri");
        linkedHashSet.add("Gunwant");
        linkedHashSet.add("Stephy");
        linkedHashSet.add("Nit");
        linkedHashSet.add(null);
        linkedHashSet.add("Nitin");
        linkedHashSet.add("Gunwant");

        for(String str:linkedHashSet){
            System.out.println(str);
        }
    }
}
