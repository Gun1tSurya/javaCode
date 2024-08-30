package hacker_rank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SherlockValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
        for(int i=0;i<s.length();i++){

        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\gunwants\\OneDrive - AMDOCS\\Backup Folders\\Desktop\\GSS\\text"));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
