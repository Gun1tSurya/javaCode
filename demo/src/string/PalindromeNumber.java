package string;

public class PalindromeNumber {
    public static void main(String[] args) {

        int no= 1222221;
        int temp = no;
        int rev = 0,rem;

        while(temp != 0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(no == rev){
            System.out.println("No is palindrome");
        }
        else{
            System.out.println("No is not palindrome");
        }
    }
}
