package hacker_rank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PalindromeSubstring {

    public static void main(String[] args) {
        String str = "Nitin";
        allPalindromicSubstring(str);
    }

    private static void allPalindromicSubstring(String str) {
            Set<String> set = new HashSet<>();
            for(int i=0;i<str.length();i++){
                expand(str,i,i,set);
                expand(str,i,i+1,set);
            }
        System.out.println(set);
    }

    private static void expand(String str, int low, int high, Set<String> set) {
        while (low >= 0 && high < str.length() && str.charAt(low) ==str.charAt(high)){

            //push all palindrome elements into set
            set.addAll(Collections.singleton(str.substring(low, high + 1)));
            low--;
            high++;
        }
    }
}
