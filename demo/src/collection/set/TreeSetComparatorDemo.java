package collection.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(70);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(0);
        System.out.println(treeSet);
    }
}
class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        if(I1<I2){
            return 1;
        }else if(I1 > I2){
            return -1;
        }else{
            return 0;
        }
    }
}