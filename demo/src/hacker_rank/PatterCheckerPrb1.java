package hacker_rank;

/*
Sample Input:-
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output:-
Valid
Invalid
Invalid

 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatterCheckerPrb1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            if(pattern != null && !pattern.equals("")){
                try{
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                }catch(PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }
            testCases--;
        }
    }
}

