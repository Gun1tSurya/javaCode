package generics;

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

    public <E,N> void display(E elements, N number){
        System.out.println("Elements is :"+ elements + " Number is:" + number);
    }
}



public class App {
    public static void main(String[] args) {
        Data<Integer,String > customeGenerics = new Data<Integer, String>(1,"India");
        System.out.println("Printing Keys: " + customeGenerics.getKey() + " Printing Values: " + customeGenerics.getValue());
        customeGenerics.display(45.2,34);
    }
}
