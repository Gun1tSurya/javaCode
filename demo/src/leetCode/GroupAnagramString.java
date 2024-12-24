package leetCode;

/*

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

 */


import java.util.*;

public class GroupAnagramString {
    public static void main(String[] args) {

        String[] inputArr = {"eat","tea","tan","ate","nat","bat"};

        System.out.println("grouped anagram:"+getAnagramGroupList(inputArr));
    }

    private static ArrayList<List<String>> getAnagramGroupList(String[] inputArr) {

        Map<String,List<String>> groupAnagram = new HashMap<>();

        for(String str:inputArr){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);
            if(!groupAnagram.containsKey(sortedString)){
                groupAnagram.put(sortedString,new ArrayList<>());
            }
            groupAnagram.get(sortedString).add(str);
        }

        return new ArrayList<>(groupAnagram.values());
    }
}
