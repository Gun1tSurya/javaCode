package CallByValueVsCallByRef;

public class CallByRefDemo {
    public static void main(String[] args) {
        String[] names = {"Gunwant","Nitin","Mayuri","Shweta","Nana"};
        System.out.println(names);
        CallByRefDemo refDemo = new CallByRefDemo();
        refDemo.displayName(names);
        System.out.println("In main method: "+ names);
        System.out.println(names[0]);
    }

    private void displayName(String[] names) {
        for (String name: names){
            System.out.println("In display name method: "+ name);
        }
        names[0] = "Gun";
    }
}
