package interfacecode;

public class PhoneMain {
    public static void main(String[] args) {

        phone phone = new OnePlus();
        System.out.println("One Plus Specification");
        System.out.println(phone.Processor());
        System.out.println(phone.OS());
        System.out.println(phone.SpaceInGB());


        phone phone1 = new Redmi();
        System.out.println("Red-mi Specification");
        System.out.println(phone1.Processor());
        System.out.println(phone1.OS());
        System.out.println(phone1.SpaceInGB());
    }
}
