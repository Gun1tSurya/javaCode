package string;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String reverse = "";

        for(int i=A.length()-1; i>=0; i--){
            reverse = reverse + A.charAt(i);
        }
        if(reverse.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
