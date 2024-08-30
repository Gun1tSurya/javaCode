
package collection.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,Object> putMap = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        map.put("Gunwant",27);
        map.put("Gunwan",28);
        map.put("Gunwan",29);

        System.out.println(map);
        Set set = new HashSet();
        set.add(map);
        System.out.println(set);

        Map<String,String > map1 = new HashMap<String, String>(){{
          put("key1","value1");
        }};

        Map<String,String> emptyMap = Collections.EMPTY_MAP;


        Map<String, Integer> map2 = Stream.of(new Object[][] {
                { "data1", 1 },
                { "data2", 2 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

        System.out.println(map2);


    }
}

