package string;

public class ReverseStringByChar {

    public static void main(String[] args) {

        String str = "race a ecar";

        int length = str.length();
        String rev = "";

        for(int i=length-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.print("Pass string is palindrome");
        }else{
            System.out.print("Pass string is NOT palindrome");
        }
    }
}
