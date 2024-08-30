package hacker_rank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SherlockAnagramPrb1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int tc = 0; tc < T; tc++) {
            String S = in.next();
            System.out.println(findUnorderedAnagramPairNum(S));
        }

        in.close();
    }

    private static int findUnorderedAnagramPairNum(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // Keep track of how many anagrams we've seen
        int totalCount = 0;

        // Generate all substrings (N^2)
        for(int i = 0 ; i < s.length(); i++)
        {
            for(int j=i+1 ; j <= s.length(); j++)
            {
                String currentSubString = s.substring(i,j);

                // Sort all strings E.g. ab & ba both == ab now
                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);

                // If sorted substring has been seen before
                if(map.containsKey(currentSubString))
                {
                    // Check how many times we've seen it and add that amount to the count
                    int value = map.get(currentSubString);
                    totalCount=totalCount+value;

                    // Increment the times we've seen the string
                    map.put(currentSubString, value+1);
                }
                else
                {
                    // Never seen it before = insert and set to 1 to indiciate we've now seen it
                    map.put(currentSubString, 1);
                }
            }
        }
        return totalCount;
    }

    /*static int findUnorderedAnagramPairNum(String str) {
        Map<String, Integer> key2count = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String key = generateKey(str.substring(i, j));
                if (!key2count.containsKey(key)) {
                    key2count.put(key, 0);
                }
                key2count.put(key, key2count.get(key) + 1);
            }
        }
        return key2count.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
    }

    static String generateKey(String str) {
        return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
    }*/

}
