package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{

    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ComparatorSortUsingLambda {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Andrue"));
        list.add(new Data("Nitin"));
        list.add(new Data("Mayuri"));
        list.add(new Data("Shweta"));
        list.add(new Data("Bhushan"));

       /* Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data data1, Data datat2) {
                return data1.getName().compareTo(datat2.getName());
            }
        });*/

       //Using Lambda
        Collections.sort(list,(Data d1, Data d2)->{
             if(d1.getName().length() < d2.getName().length()){
                 return -1;
             }else if(d1.getName().length() > d2.getName().length()){
                 return 1;
             }else{
                 return 0;
             }
        });

        for(Data data : list){
            System.out.println(data.getName());
        }
    }
}
