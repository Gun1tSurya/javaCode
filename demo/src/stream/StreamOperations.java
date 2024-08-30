package Stream;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {
    public StreamOperations() {
        super();
    }

    //Different way to create Stream
    public static void main(String args[]) {
        System.out.println("Using Stream.of(val1,val2,val3...)");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        stream.forEach(p -> System.out.println(p));

        //2.Using Stream.of(arrayOfElements)
        System.out.println("Using Stream.of(arrayOfElements)");
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5,6,7,8});
        stream1.forEach(p-> System.out.println(p));

        System.out.println("Using List.stream()");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        stream2.forEach(p-> System.out.println(p));

        System.out.println("Using Stream.generate() or Stream.iterate()");
        Stream<Date> stream3 = Stream.generate(()->{ return  new Date();});

        System.out.println("String chars or String tokens");
        Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
        stream4.forEach(p-> System.out.println(p));

        IntStream intStream = "12252_sdf".chars();
        intStream.forEach(p-> System.out.println(p));

        System.out.println("Convert Stream to List - Stream.collect(Collectors.list)");
        List<Integer> listToStream = new ArrayList<Integer>();
        for(int i =10; i<20; i++){
            listToStream.add(i);
        }
        Stream<Integer> stream5 = listToStream.stream();
        List<Integer> streamToList = stream5.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("After Converting from stream to list " + streamToList);



        System.out.println("########################################");
        List<Integer> list1 = new ArrayList<Integer>();

        for(int i=30;i<40;i++){
            list1.add(i);
        }

        Stream<Integer> stream6 = list1.stream();
        Integer[] evenNumArray = stream6.filter(i->i%2==0).toArray(Integer[]::new);
        System.out.println("Convert Stream to Array- Stream.toArray(EntryType[]::new)");
        System.out.print(evenNumArray);


        System.out.println("##################Stream Intermediate operations####################");
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Nimay");
        memberNames.add("NimayGun");
        memberNames.add("GunNimay");
        memberNames.add("Nirbhay");
        memberNames.add("Ninad");
        memberNames.add("Nitin");

        memberNames.stream().filter((p)-> p.contains("Ni"))
                .forEach(System.out::println);

        System.out.println("######Using Map-> toUpperCase########");
        memberNames.stream().filter((p)->p.endsWith("y")).map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("######Using Map Sorted-> toLowerCase########");
        memberNames.stream().sorted().map(String::toLowerCase)
                .forEach(System.out::println);

        System.out.println("##################Stream Terminal operations####################");

        System.out.println("########Stream.match()#########");

        boolean matchResult = memberNames.stream().allMatch((s)->s.startsWith("ni"));
        System.out.println(matchResult);


        System.out.println("###############Stream short-circuit operations #################");

        String firstMatchName = memberNames.stream().filter(p->p.startsWith("Ni")).findFirst().get();
        System.out.println(firstMatchName);

        Boolean anyMatch = memberNames.stream().anyMatch((p)->p.equals("Nimay"));
        System.out.println(anyMatch);

        System.out.println("########################Flatmap Example###############################");
        //In case of flatMap(), a one-to-many mapping is created where for each input element/stream,
        // we first get a multiple values and then we flatten the values from all such input streams into
        // a single output stream. For example, we may write program to find all district words from all
        // lines in a text file

        List<Integer> list2 = Arrays.asList(1,2,3);
        List<Integer> list3 = Arrays.asList(4,5,6);
        List<Integer> list4 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfList = Arrays.asList(list2,list3,list4);

        List<Integer> list5 = listOfList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(list5);

        System.out.println("Infinite Stream of random number");
        List<Integer> list6 = Stream.generate(()->(new Random().nextInt(100))).limit(10).collect(Collectors.toList());
        System.out.println(list6);

        System.out.println("###########Find Min or Max Number############");
        Integer maxNumber = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::intValue)).get();
        Integer minNumber = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::intValue)).get();
        System.out.println("Max number: " +  maxNumber + " Min Number: " + minNumber);

        System.out.println("###########Find Min or Max Character############");
        String maxString = Stream.of("han","G","T","A","B","Z").max(Comparator.comparing(String::valueOf)).get();
        String minString = Stream.of("han","G","T","A","B").min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Max number: " +  maxString + " Min Number: " + minString);

        System.out.println("Reading txt file");
        //method to read line by line
        try {
            Stream<String> lines = Files.lines(Paths.get("C:\\Users\\gunwants\\Desktop","demo.txt"));
            Optional<String> hasPassword =  lines.onClose(()->System.out.println("File Close"))
                    .filter(s->s.contains("password")).findFirst();
            if(hasPassword.isPresent()){
                System.out.println(hasPassword.get());
            }
            lines.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //if else logic using stream
        System.out.println("######################If else login using stream######################");
        ArrayList<Integer> numberOfInteger = new ArrayList<>(Arrays.asList(1,2,4,3,5));
        numberOfInteger.stream().filter(i->i%2==0).forEach(System.out::println);

        System.out.println("#####################Can we reuse stream? No.#######################################");
        List<Integer> tokens = Arrays.asList(1,2,4,5,3);

        Optional<Integer> result = tokens.stream().max(Integer::compareTo);
        System.out.println(result.get());

        result = tokens.stream().min(Integer::compareTo);
        System.out.println(result.get());

        long count = tokens.stream().count();
        System.out.println(count);

    }
}
