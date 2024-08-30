package collection.collectionArrayProblems;


public class NITTest {
    public static void main(String[] args) {
        NITCollection col = new NITCollection();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add(6.2);
        col.add(null);
        col.add(null);
        col.add(null);
        col.add("a");
        col.add("q");col.add("j");col.add("r");col.add(5);
        System.out.println("Capacity of array "+ col.capacity());
        System.out.println("Size of array "+ col.size());
        col.remove(2);
        System.out.println(col.get(2));
        //System.out.println(col.replace(2,"C"));
    }

}
