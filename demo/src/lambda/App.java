package lambda;

interface Lambda{
    void demo();
}

public class App {
    public static void main(String[] args) {
        Lambda lambda = ()-> {
            System.out.println("Test Lambda");
        };
        lambda.demo();
    }
}
