package StaticElements;

public class App {
    public static void main(String[] args) {
        TestStatic obj1 = new TestStatic();
        System.out.println( "Obj1 current veriable value" +obj1.getStaticCount());
        obj1.setStaticCount(1);
        System.out.println("Obj1 current veriable value" + obj1.getStaticCount());

        TestStatic obj2 = new TestStatic();
        System.out.println( "Obj1 current veriable value" +obj2.getStaticCount());
        obj2.setStaticCount(21);
        System.out.println("Obj1 current veriable value" + obj2.getStaticCount());

        //After making variable static value is not changing, there is only one copy of variable.
        TestStatic obj3 = new TestStatic();
        System.out.println("Obj3 current veriable value" +obj3.getStaticCount());


    }
}
