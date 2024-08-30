package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStream {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1,4,6);
        Stream<Integer> secondStream = Stream.of(3,6,7,9);
        Stream<Integer> thirdStream = Stream.of(13,63,7,19);
        Stream<Integer> fourthStream = Stream.of(73,64,72,9);
        Stream<Integer> resultingStream = Stream.concat(firstStream, Stream.concat(secondStream,Stream.concat(thirdStream,fourthStream))).distinct().sorted();
        System.out.println(resultingStream.collect(Collectors.toList()));
    }
}
