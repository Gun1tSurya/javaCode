package leetCode;

public class gcdOfTwoString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(calculateGCD(str1,str2));
    }

    private static String calculateGCD(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1)) {
            int a = str1.length();
            int b = str2.length();
            int gcd = gcd(a, b);
            return str1.substring(0, gcd);
        }else{
            return "";
        }
    }

    private static int gcd(int a, int b) {
        while(b%a != 0){
            int temp = b%a;
            b = a;
            a = temp;
        }
        return a;
    }
}
