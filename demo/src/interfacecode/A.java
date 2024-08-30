package interfacecode;

public interface A {
    default void mymethod(){
        System.out.println("Inside mymethod A()");
    }

    default void perform(){
        System.out.println("A");
    }
}
