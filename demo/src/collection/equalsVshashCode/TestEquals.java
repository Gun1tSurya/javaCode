package collection.equalsVshashCode;

import java.util.HashMap;
import java.util.Map;

public class TestEquals {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        //we need to customize Employee class to add equals method
        Map<Employee,String> map = new HashMap<>();
        map.put(emp1,"Nitin");
        map.put(emp2,"Nitin");
        System.out.println(map.size());

        //Wrapper class Integer has in built equals method
        Integer i = new Integer(1);
        Integer i1 = new Integer(1);
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(i,"one");
        map1.put(i1,"one");
        System.out.println(map1.size());
    }
}
