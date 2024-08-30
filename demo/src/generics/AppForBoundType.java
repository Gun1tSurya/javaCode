package generics;

import java.lang.annotation.ElementType;

class Databoudtype<K,V>{
    private K key;
    private V value;

    public Databoudtype(K key, V value) {
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
        return "Databoudtype{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E extends Character, N extends Number> void Display(E Element , N number){
        System.out.println("Element "+ Element + " Number "+ number);
    }
}



public class AppForBoundType {
    public static void main(String[] args) {
        Databoudtype<Integer,String> databoudtype = new Databoudtype<>(1,"one");
        databoudtype.Display('c',74.3);
    }
}
