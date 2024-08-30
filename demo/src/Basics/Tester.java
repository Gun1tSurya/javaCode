package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<Object> list2 = Collections.singletonList(list1);
        list2.add(new Integer(12));
        System.out.println(list2.size());
    }
}
