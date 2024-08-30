package string;

public class ReverseStringByChar {

    public static void main(String[] args) {

        String str = "Nimay";

        int length = str.length();
        String rev = "";

        for(int i=length-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
