package collection.map;

import Stream.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MapUsingTreeMap {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        Employee employee = new Employee(23,"Anand",50000);
        Employee employee1 = new Employee(43,"Zandu",1500);
        Employee employee2 = new Employee(13,"Gaju",150000);
        Employee employee3 = new Employee(33,"Gunwant",30000);
        map.put(employee.getEmp_Name(), employee);
        map.put(employee2.getEmp_Name(),employee2);
        map.put(employee3.getEmp_Name(),employee3);
        map.put(employee1.getEmp_Name(),employee1);

        List<String> employeeKey = new ArrayList<>(map.keySet());
        Collections.sort(employeeKey);
        System.out.println(employeeKey);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        TreeMap<String,Employee> treeMap = new TreeMap<>();
        treeMap.putAll(map);

        //Map.equals() doesn't work when the value type is array, as an array's equals() method compares identity and not the contents of the array:
        Map<String,String[]> firstMap = new HashMap<>();
        firstMap.put("India",new String[]{"Mumbai","Delhi"});

        Map<String,String[]> secondMap = new HashMap<>();
        secondMap.put("India",new String[]{"Mumbai","Delhi"});

        System.out.println(firstMap.equals(secondMap));

    }
}
