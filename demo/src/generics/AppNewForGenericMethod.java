package generics;

import java.util.ArrayList;
import java.util.List;

class DataNew{

    public <E> void printList(List<E> eList){
        for(E elements:eList){
            System.out.println(elements);
        }
    }

    public <E> void printArray(E[] array){
        for(E elements:array){
            System.out.println(elements);
        }
    }
}

public class AppNewForGenericMethod {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(51);
        integerList.add(54);
        integerList.add(511);

        List<String> stringList = new ArrayList<>();
        stringList.add("Gunwant");
        stringList.add("Gun");
        stringList.add("want");
        stringList.add("ant");
        stringList.add("Gunw");

        String[] stringArray = {"one","two","three"};
        Integer[] intArray = {2,5,3};
        Double[] doubleArray = {2.5,235.5,23.3};

        DataNew obj = new DataNew();

        System.out.println("Printing Custom Integer List Below:");
        obj.printList(integerList);
        System.out.println("********************************************");

        System.out.println("Printing Custom String List Below:");
        obj.printList(stringList);
        System.out.println("******************************************");

        System.out.println("Printing Custom String Array");
        obj.printArray(stringArray);
        System.out.println("**********************************************");

        System.out.println("Printing Custom Integer Array");
        obj.printArray(intArray);
        System.out.println("**********************************************");

        System.out.println("Printing Custom Double Array");
        obj.printArray(doubleArray);
        System.out.println("**********************************************");
    }
}
