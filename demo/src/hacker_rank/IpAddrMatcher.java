package hacker_rank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddrMatcher {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            IPAddressValidator();
            validate(IP);
        }

    }
    private static void IPAddressValidator() {
        pattern = Pattern.compile(IPADDRESS_PATTERN);
    }
    private static Matcher validate(String ip) {
        matcher = pattern.matcher(ip);
        return matcher;
    }

}
