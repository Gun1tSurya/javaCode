package Basics;

public interface Interface1 {
    default public void method1(){
        System.out.println("Inside default method");
    }
}
interface DefaultExtend{
    default public void method1(){
        System.out.println("Default method redefined");
    }
}


