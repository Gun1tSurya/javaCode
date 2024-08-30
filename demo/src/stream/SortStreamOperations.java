package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortStreamOperations {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,4,6,3,5,6);
        stream.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        //Sort Stream of String
        Stream<String> stream1 = Stream.of("R","E","W","V");
        stream1.sorted()
                .forEach(System.out::println);

        stream1.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
