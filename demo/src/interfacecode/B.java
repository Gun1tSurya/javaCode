package interfacecode;

public interface B {
    public void mymethod();
    default void perform(){
        System.out.println("B");
    }
}
