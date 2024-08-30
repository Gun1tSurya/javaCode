package hacker_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Sample Input:-
He is a very very good boy, isn't he?

Sample Output:-
10
He
is
a
very
very
good
boy
isn
t
he

 */

public class StringTokenPrb1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        if (s.trim().isEmpty()) {
            System.out.println(0);
        }
        else{
            String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
            System.out.println(splitString.length);
            for (String string : splitString) {
                System.out.println(string);
            }
        }

    }
}
