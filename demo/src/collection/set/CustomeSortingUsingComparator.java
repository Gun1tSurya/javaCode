package collection.set;

import java.util.*;

class DataNew<K,V>{
    private K key;
    private V value;

    public DataNew(K key, V value) {
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
        return "DataNew{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}


public class CustomeSortingUsingComparator {
    public static void main(String[] args) {

        Comparator<DataNew<Integer,String>> comparator = new Comparator<DataNew<Integer, String>>() {
            @Override
            public int compare(DataNew<Integer, String> obj1, DataNew<Integer, String> obj2) {
                if(obj1.getKey() > obj2.getKey()){
                    return 1;
                }else if(obj2.getKey() > obj1.getKey()){
                    return -1;
                }else
                    return 0;
            }
        };

        Comparator<DataNew<Integer,String>> comparatorValues = new Comparator<DataNew<Integer, String>>() {
            @Override
            public int compare(DataNew<Integer, String> obj1, DataNew<Integer, String> obj2) {
                if(obj1.getValue().length() > obj2.getValue().length()){
                    return 1;
                }else if(obj2.getValue().length() > obj1.getValue().length()){
                    return -1;
                }else
                    return 0;
            }
        };

        Set<DataNew<Integer,String>> setData = new TreeSet<>(comparator);
        setData.add(new DataNew(3,"three"));
        setData.add(new DataNew(1,"one"));
        setData.add(new DataNew(4,"four"));
        setData.add(new DataNew(4,"four"));
        setData.add(new DataNew(5,"five"));

        for(DataNew<Integer,String> elements:setData){
            System.out.println(elements);
        }
    }
}
