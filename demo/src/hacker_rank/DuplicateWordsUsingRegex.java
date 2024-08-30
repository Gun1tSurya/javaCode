package hacker_rank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

“\\b”: A word boundary. Boundaries are needed for special cases. For example, in “My thesis is great”, “is” wont be matched twice.
“\\w+” A word character: [a-zA-Z_0-9]
“\\W+”: A non-word character: [^\w]
“\\1”: Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
“+”: Match whatever it’s placed after 1 or more times

 */

public class DuplicateWordsUsingRegex {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
