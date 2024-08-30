package collection.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestComparator {
    public static void main(String[] args) {

        List<Laptop1> list = new ArrayList<>();
        list.add(new Laptop1("Dell",8,40000));
        list.add(new Laptop1("Apple",16,60000));
        list.add(new Laptop1("HP",8,39000));

        Comparator<Laptop1> cmp = new Comparator<Laptop1>() {
            @Override
            public int compare(Laptop1 laptop1, Laptop1 laptop2) {
                if(laptop1.getPrice() > laptop2.getPrice()){
                        return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list,cmp);
     /*   for (Laptop1 l:list
             ) {
            System.out.println(l);
        }*/

        Stream<List<Laptop1>> stream = Stream.of(list);
        stream.forEach(s->System.out.println(s));
    }
}
