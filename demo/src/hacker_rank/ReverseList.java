package hacker_rank;

import java.util.ArrayList;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(4);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(4);

        List<Integer> results = ReverseList.reversearr(list);
        System.out.println(results);
    }

    private static List<Integer> reversearr(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
