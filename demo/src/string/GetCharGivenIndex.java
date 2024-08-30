package string;

public class GetCharGivenIndex {
    public static void main(String[] args) {
        String str = "Java Excercises!";
        System.out.println("Given String is : " + str);

        int index = str.charAt(0);
        int index1 = str.charAt(10);

        System.out.println("The Character at position 0 is " + (char)index);
        System.out.println("The Character at position 10 is " + (char)index1);
    }
}
