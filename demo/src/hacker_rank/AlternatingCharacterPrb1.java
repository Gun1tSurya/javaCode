package hacker_rank;

import java.util.Scanner;

public class AlternatingCharacterPrb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i = 1; i <= q; i++) {
            String test = scanner.next();
            int count=0;
            for (int j = 0; j < test.length()-1; j++) {
                if(test.charAt(j)==test.charAt(j+1))
                    count++;
            }
            System.out.println(count);
        }
    }


}
