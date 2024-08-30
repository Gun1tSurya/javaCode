package collection.set;

import java.util.TreeSet;

public class TreeSetUsingStrBuffer implements Comparable{
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("q"));
        treeSet.add(new StringBuffer("a"));
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("A"));
        System.out.println(treeSet);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
