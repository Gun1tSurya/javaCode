package designPattern.singleton;

class Singleton {
    private static Singleton singleton_instance = null;
    public String s = null;

    //private constructor restricted to this class itself only
    private   Singleton(){
        s = "Hello I'm String part of singleton class";
    }

    // static method to create instance of singleton class
    public static Singleton getInstance(){
        if(singleton_instance == null)
            singleton_instance = new Singleton();
        return singleton_instance;
    }
}
class Main{
    public static void main(String[] args) {

        //Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        //Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        //Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        x.s  = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
