package interfacecode;


public class Swift implements C,A{
    public static void main(String[] args) {
        new Swift().perform();
        new Swift().mymethod();
    }

    @Override
    public void mymethod() {
        System.out.println("In Swift class mymethod()");
    }

    /*@Override
    public void mymethod() {
        System.out.println("Override method");
    }*/
}
