package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayStrings = new ArrayList<String>();
        arrayStrings.add("hello");
        arrayStrings.add("how are you");
        arrayStrings.add("good");
        arrayStrings.add(3,"I'm Fine");

        arrayStrings.remove(2);
        arrayStrings.stream().forEach(s-> System.out.println(s));
    }
}
