package Inner_Classes;

public class Shop {
    public static void main(String[] args) {

       // Door door = new Door();

        // Nameless object is nothing but anonymous object
        if(new Door().isLocked(args[0])){
            System.out.println("Shop is closed now, visit later");
        }else {
            System.out.println("Welcome we are open");
        }
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
