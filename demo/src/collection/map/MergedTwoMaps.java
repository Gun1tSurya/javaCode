package collection.map;

import Stream.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoMaps {
    public static void main(String[] args) {

        Map<String, Employee> map1 = new HashMap<String,Employee>();

        Employee emp1 = new Employee(1,"Aashish",70000);
        Employee emp2 = new Employee(10,"Gunwant",60000);
        Employee emp3 = new Employee(5,"Mayuri",100000);
        map1.put("first",emp1);
        map1.put("second",emp2);
        map1.put("third",emp3);

        Map<String,Employee> map2 = new HashMap<>();

        Employee emp4 = new Employee(4,"Shweta",65000);
        Employee emp5 = new Employee(14,"Bhu",165000);
        map2.put("fourth",emp4);
        map2.put("fifth",emp5);



        Map<String, Employee> result = Stream.concat(map1.entrySet().stream(),map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(result);

    }
}
