package Java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.*;

public class SimpleDotComTestDrive {
    public static void main(String[] args) throws IOException {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        simpleDotCom.setLocation(locations);
        /*String UserguessNo = "2";
        simpleDotCom.checkYourself(UserguessNo);*/

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        System.out.println(readLine);*/

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter your Input " + s);

    }
}
