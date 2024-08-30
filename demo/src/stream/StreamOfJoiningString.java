package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfJoiningString {
    public static void main(String[] args) {
        Stream<String> words = Arrays.asList("A","B","E","K").stream();
        String joinedString = words.collect(Collectors.joining());
        System.out.println("Joined String "+ joinedString);

        joinedString = words.collect(Collectors.joining(","));      //A,B,C,D
        System.out.println( joinedString );

        joinedString = words.collect(Collectors.joining(",","{","}"));
        System.out.println("After few modifications "+joinedString);
    }
}
