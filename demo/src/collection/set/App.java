package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}

public class App {
    public static void main(String[] args) {

        Comparator<Data<Integer,String>> compare_key = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {

                if(obj1.getKey() > obj2.getKey()){
                        return 1;
                }else if(obj1.getKey() < obj2.getKey()){
                    return -1;
                }else
                return 0;
            }
        };

        Comparator<Data<Integer,String>> compare_value = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getValue().length() > obj2.getValue().length()){
                    return 1;
                }else if(obj1.getValue().length() < obj2.getValue().length()){
                    return -1;
                }else
                    return 0;
            }
        };

        Set<Data<Integer, String>> setData = new TreeSet<>(compare_value);
        setData.add(new Data<Integer, String>(1,"One"));
        setData.add(new Data<Integer, String>(2,"Two"));
        setData.add(new Data<Integer, String>(3,"Three"));
        setData.add(new Data<Integer, String>(4,"Four"));
        setData.add(new Data<Integer, String>(9,"Nine"));
        setData.add(new Data<Integer, String>(6,"Two"));
        setData.add(new Data<Integer, String>(6,"Seven"));

        for (Data<Integer, String> elements:setData) {
            System.out.println("Elements from set: "+ elements);
        }
    }
}
