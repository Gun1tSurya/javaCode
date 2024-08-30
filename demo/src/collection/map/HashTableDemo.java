package collection.map;

import java.util.Hashtable;
import java.util.Objects;

public class HashTableDemo {

    public static void print(){

    }

    public static void main(String[] args) {
        Hashtable hashTable = new Hashtable();
        hashTable.put(new Test(5),"A");
        hashTable.put(new Test(2),"B");
        hashTable.put(new Test(6),"C");
        hashTable.put(new Test(15),"D");
        hashTable.put(new Test(23),"E");
        hashTable.put(new Test(16),"F");

        System.out.println(hashTable);

    }
}
class Test{
    int i;

    public Test(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return i == test.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                '}';
    }
}
