package string;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfCharInString {

    public static void main(String[] args) {
        String str = "aacccbbmffffq";

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int cnt = map.get(c);
                map.put(c,++cnt);
            }else{
                map.put(c,1);
            }
        }
        System.out.println("Given String occurance is : " + map);
    }
}
