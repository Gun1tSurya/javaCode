package Basics;

import java.util.HashSet;

public class HashsetAndInteger {
    public static void main(String[] args) {
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(13);
        Integer i3 = new Integer(14);
        HashSet hashSet = new HashSet();
        hashSet.add(i1);
        hashSet.add(i2);
        hashSet.add(i3);
        System.out.println(hashSet);
    }
}
