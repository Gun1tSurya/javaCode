package Java_Practice.accessspecifier;

public class InitDemo {
    int a;
    public InitDemo(int val){
        a = val;
        System.out.println("Value of a: "+ a);
    }

    public InitDemo() {

    }


    public static void main(String[] args) {
        new InitDemo();
    }
}
