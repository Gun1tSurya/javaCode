package collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap{
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(12,"Nimay");
        map.put(34,"Ni");
        map.put(45,"may");
        map.put(23,"Gunwant");
        map.put(32,"Nitin");
        map.put(124,"Mayu");

        for(Map.Entry e:map.entrySet()){
            System.out.println(e.getKey() + " and value is " + e.getValue());
        }

        //using stream
        System.out.println("Display map using stream");
        map.entrySet().stream().forEach(e1-> System.out.println(e1));
    }
}
