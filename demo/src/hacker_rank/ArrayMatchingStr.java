package hacker_rank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayMatchingStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfStrings = sc.nextInt();

        String str[] = new String[noOfStrings];

        for (int i = 0; i < noOfStrings; i++) {
            str[i] = sc.next();
        }
        int queries = sc.nextInt();
        String strQ[] = new String[queries];

        for (int i = 0; i < queries; i++) {
            strQ[i] = sc.next();
        }
        int[] counter = matchingStrings(str, strQ);
        System.out.println(Arrays.toString(counter));
        sc.close();

    }

    private static int[] matchingStrings(String[] first, String[] second) {
        Map<String,Integer> map = new HashMap<>();
        int result[] = new int[second.length];

        for(int i=0;i<first.length;i++){
            String inputKey = first[i];
            if(map.containsKey(inputKey)){
                map.put(inputKey,map.get(inputKey)+1);
            }else{
                map.put(inputKey,1);
            }
        }

        for(int i=0;i<second.length;i++){
            String outputKey = second[i];
            if(map.containsKey(outputKey)){
                result[i] = map.get(outputKey);
            }
        }

        return result;
    }
}
