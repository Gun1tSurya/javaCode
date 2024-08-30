package hacker_rank;

import java.util.*;

public class CountDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(6);


        int results = CountDuplicates.countList(list);
        System.out.println(results);
    }

    private static int countList(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int i=0;i<list.size();i++){
            if(set.contains(list.get(i))){
                duplicates.add(list.get(i));
            }else{
                set.add(list.get(i));
            }
        }
        return duplicates.size();
    }
}
