package hacker_rank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrPrb1 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int pairs = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<pairs;i++){

            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();

            Set firstSet = new HashSet();
            Set secondSet = new HashSet();

            for(int m = 0;m<firstStr.length();m++)
                firstSet.add(firstStr.charAt(m));

            for(int n = 0;n<secondStr.length();n++)
                secondSet.add(secondStr.charAt(n));

            //retailAll:- Perform intersection of the two set
            firstSet.retainAll(secondSet);

            if(firstSet.size()>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
