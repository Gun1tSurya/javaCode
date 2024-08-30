package linkList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("South Africa");
        countries.add("NewZeland");
        countries.add("Australia");
        countries.add("China");

        App app = new App();
        app.printList(countries);
        countries.add(1,"Canada");
        app.printList(countries);

        Collections.reverse(countries);  // Collections is parent class of List class hence we are able to access reverse() method.
        System.out.println("After Reverse Method of Collections: ");
        app.printList(countries);
    }

    public static void printList(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Printing Elements Using Iterator: " + iterator.next());
        }
        System.out.println("**********************************");
    }
}
