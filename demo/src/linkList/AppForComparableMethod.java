package linkList;

import java.util.*;

class Names implements Comparable<Names>{

     private String names;

    public Names(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return names;
    }

    @Override
    public int compareTo(Names obj) {
        if(names.length() == obj.names.length()){
            return 0;
        } else if(names.length() < obj.names.length()){
            return -1;
        } else{
            return 1;
        }
    }
}


public class AppForComparableMethod {
    public static void main(String[] args) {
        List names = new LinkedList<>();
        names.add(new Names("Chand"));
        names.add(new Names("Ed"));
        names.add(new Names("John"));
        names.add(new Names("Mia"));

        AppForComparableMethod app = new AppForComparableMethod();
        System.out.println("Before Custom Sorting");
        app.printList(names);
        Collections.sort(names);
        System.out.println("After Custom Sorting");
        app.printList(names);
    }

    private void printList(List<Names> names) {
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println("Elements: " + iterator.next());
        }
    }
}
