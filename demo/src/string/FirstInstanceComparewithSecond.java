package string;
/*
Check whether the first instance of 'z' is immediately followed by another 'z' in a given string
 */

public class FirstInstanceComparewithSecond {
    public static void main(String[] args) {

        String str = "fizzez";
        System.out.println("Given string is :" + str);
        System.out.println("output is :" + checkCharOccurances(str));
    }

    private static boolean checkCharOccurances(String str) {
        int index = str.indexOf("z");
        if(index+1 >= str.length()) return false;
        return str.substring(index+1,index+2).equals("z");
    }
}
