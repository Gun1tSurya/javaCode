package Java_Practice.accessspecifier;

public class Test {
    static int p = test();

    static public int test() {
        System.out.println(p);
        return  99;
    }

    public static void main(String[] args) {
        System.out.println(p);
    }
}
