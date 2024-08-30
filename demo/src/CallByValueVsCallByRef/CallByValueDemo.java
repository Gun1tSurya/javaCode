package CallByValueVsCallByRef;

public class CallByValueDemo {
    public static void main(String[] args) {

        int value = 10;
        System.out.println("Current Value of variable value in main method : " + value);
        CallByValueDemo callByValueDemo = new CallByValueDemo();
        callByValueDemo.displayValue(value);
        System.out.println("Current Value of variable value in main method2 : " + value);
    }

    private void displayValue(int value) {
        System.out.println("Current Value of variable value in display method : " + value);
        value = 20;
        System.out.println("Current Value of variable value in display method2 : " + value);
    }
}
