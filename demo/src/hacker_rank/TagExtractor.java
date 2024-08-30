package hacker_rank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String regex = "(<[^>]*>)";
        Pattern pattern = Pattern.compile(regex);
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = pattern.matcher(line);

            String previousTag = null;
            int previousPos = -1;
            boolean isMatched = false;
            while (m.find()){
                String htmltag = line.substring(m.start(),m.end());
                if((htmltag.charAt(1)) !=  '/'){
                    previousTag = htmltag;
                    previousPos = m.end();
                }else if(htmltag.charAt(1)=='/' && previousTag != null){
                    if(previousTag.substring(1).equals(htmltag.substring(2)) && previousTag.length()>2 && m.start()>previousPos+1){
                        System.out.println(line.substring(previousPos,m.start()));
                        isMatched = true;
                    }
                    previousTag = null;
                }
            }
            System.out.print(isMatched?"":"None");
            testCases--;
        }


    }
}
