package string;

public class ReverseChar {

    public static void main(String[] args) {
        String str = "This is string to reverse";
        ReverseChar reverseChar = new ReverseChar();
        reverseChar.reverseString(str);
    }

    private void reverseString(String str) {
        if(str == null || str.length() <= 1){
            System.out.println("Not valid scenario");
        }
        else{
            System.out.println(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
    }
}
