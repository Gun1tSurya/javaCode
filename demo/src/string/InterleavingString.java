package string;

import java.util.HashSet;
import java.util.Set;

public class InterleavingString {
    public static void main(String[] args) {
        String P = "WX";
        String Q = "YZ";

        System.out.println("Initial value of string " + P + " "+ Q);
        Set<String> out = new HashSet<>();
        allInterleaving("",P,Q,out);

        out.stream().forEach(System.out::println);

    }

    private static void allInterleaving(String s, String P, String Q, Set<String> out) {

        if(P.length() == 0 && Q.length() == 0){
            out.add(s);
            return;
        }

        if(P.length() > 0){
            allInterleaving(s + P.charAt(0),P.substring(1),Q , out);
        }
        if(Q.length() > 0){
            allInterleaving(s + Q.charAt(0),P,Q.substring(1), out);
        }

    }
}
/*
YWZX
WYZX
YWXZ
WXYZ 1
YZWX
WYXZ
* */