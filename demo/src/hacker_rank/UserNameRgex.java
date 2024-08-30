package hacker_rank;

import java.util.Scanner;

/*
“[aA-zZ]” makes sure that the starting character is in the lowercase or uppercase alphabet.
“\\w{5, 29}” represents a check to make sure that the remaining items are word items, which includes the underscore, until it reaches the end and that is represented with $.
 */


public class UserNameRgex {

    private static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserNameRgex.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
