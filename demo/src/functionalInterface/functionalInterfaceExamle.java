package functionalInterface;

@FunctionalInterface
interface Calculator{
    int add(int a, int b);
}

public class functionalInterfaceExamle {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a+b;
        System.out.println("Print the value:"+ calculator);
    }
}
