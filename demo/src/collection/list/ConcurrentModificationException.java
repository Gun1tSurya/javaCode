package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {

        List<String> listOfPhone = new ArrayList<String>(Arrays.asList("iPhone 6S", "iPhone 6", "iPhone 5",
                "Samsung Galaxy 4", "Lumia Nokia"));

        System.out.println("Initial List of phones: "+ listOfPhone);

        for(String phones:listOfPhone){
            if(phones.contains("iPhone")){
               // listOfPhone.remove(phones);   Will throw concurrentModification Exception
            }
        }

        //Right way to Iterating elements using iterator's remove method.
        for(Iterator<String> iterator = listOfPhone.iterator(); iterator.hasNext();){
            String phone = iterator.next();
            if(phone.startsWith("iPhone")){
                iterator.remove();
            }
        }

        System.out.println("After removing iPhone from list "+ listOfPhone);

    }
}
