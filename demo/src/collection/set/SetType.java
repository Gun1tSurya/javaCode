package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetType {
    public static void main(String[] args) {
        Set<String> setType = new TreeSet<>();

        //HashSet:- Storing element in natural order, sequence never gyaranteed
        //LinkedHashSet:- Storing elements as per instruction in desceding order in below example
        for(int i=30;i>0;i--){
            setType.add("A"+i);
        }
        for(String i:setType){
            System.out.println(i);
        }
    }
}
