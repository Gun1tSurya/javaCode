package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListManager {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("2");
        list1.add("4");
        list1.add("6");
        list1.add("8");
        list1.add("10");
        list1.add("12");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("3");
        list2.add("5");
        list2.add("4");
        list2.add("8");
        System.out.println(removeElement(list1,list2));
        //System.out.println(findDuplicates(list1,list2));
    }

    private static List<String> findDuplicates(List<String> list1, List<String> list2) {
        list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(list1);
        return list1;
    }

    private static List<String> removeElement(List<String> list1, List<String> list2) {
        ArrayList<String>
                list3 = new ArrayList<String>(list1);
        list3.retainAll(list2);
            list1.removeAll(list2);
        return list1;
    }
}
