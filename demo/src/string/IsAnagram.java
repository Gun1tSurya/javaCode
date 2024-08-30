package string;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        boolean f = false;

        char[] c = A.toCharArray();
        Arrays.sort(c);

        char[] d = B.toCharArray();
        Arrays.sort(d);

        String str = new String(c);
        String str1 = new String(d);
        if(str.equals(str1))
            f = true;

        return f;
    }
}
