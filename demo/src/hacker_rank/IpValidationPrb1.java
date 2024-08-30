package hacker_rank;

/*
Sample Input:-
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output:-
true
true
true
false
false
false


 */


import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidationPrb1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
