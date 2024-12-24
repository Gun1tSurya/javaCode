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
        System.out.println(isPalindrome(no));

    }

    private static boolean isPalindrome(int no) {
        String str = String.valueOf(no);
        int i = 0;
        int j = str.length() - 1;

        while(j > i){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}
