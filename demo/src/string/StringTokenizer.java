package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*String[] newtr = str.split("[ !,?._'@]+");
        for(int i=0;i<newtr.length;i++){
            System.out.println(newtr[i]);
        }*/
        /*String str1 = str.replaceAll("[^a-zA-Z]"," ").trim();
        String arr[] = str1.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        if (!sc.hasNext()){
            System.out.println(0);
        }else {
            String input=sc.nextLine();
            String[]a = input.trim().split("[ !,?._'@]+");
            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            for(String strn:listOfStrings){
                System.out.println(strn);
            }
        }
    }
}
