package collection.set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String names[] ={
                new String("Gun"),
                new String ("Nit"),
                new String("Mayu"),
                new String("Gun")
        };

        Set set = new HashSet() ;
        for(int i = 0; i < names.length; i++)
            if(!set.add(names[i]))
                System.out.println("Duplicates are: "+ names[i]);
            System.out.println(set.size() + " Distinct elements are : " + set);

    }
}
