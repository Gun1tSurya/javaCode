package hacker_rank;

import java.util.regex.Pattern;

class MyRegex {
    String pattern;
    MyRegex() {
        String zeroTo255 ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    }
}
