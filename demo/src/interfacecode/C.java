package interfacecode;

public interface C extends A{
    @Override
    void mymethod();

    default void perform(){
        System.out.println("C");
    }
}
