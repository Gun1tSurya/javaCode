package overloadVsovereeding;


public class StaticMethodTest {

    private static String name;
    private static int age;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticMethodTest.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        StaticMethodTest.age = age;
    }

    public static void main(String[] args) {
        getinfoDetails(age);
        getinfoDetails();

    }

    private static String getinfoDetails() {
        return "In second method";
    }

    private static String getinfoDetails(int age) {
        return "In First Method";
    }
}
