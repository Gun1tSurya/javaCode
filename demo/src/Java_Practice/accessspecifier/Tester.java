package Java_Practice.accessspecifier;

public class Tester {
    static int x = 4;

   /* public Tester(){
        System.out.println(this.x);
        Tester();
    }*/

   /* public static void Tester(){
        System.out.println(this.x);
    }*/

    public static void main(String[] args) {
        new Tester();
    }
}
