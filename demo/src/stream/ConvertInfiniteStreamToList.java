package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertInfiniteStreamToList {
        public  static void main(String args[]){
            IntStream intStream =  IntStream.iterate(1, i->i+1);
            List<Integer> list = intStream.limit(10).boxed().collect(Collectors.toList());
            System.out.println(list);
        }
}
