package hacker_rank;

public class MakeAnagram {
    public static void main(String[] args) {
        String str1 = "cde";
        String str2 = "abc";

        System.out.println(checkAnagram(str1,str2));
    }

    private static int checkAnagram(String str1, String str2) {

        int result = 0;

        int[] count1 = new int[26];
        int count2[] = new int[26];

        for(int i=0;i<str1.length();i++)
            count1[str1.charAt(i) - 'a']++;

        for(int i=0;i<str2.length();i++)
            count2[str2.charAt(i) - 'a']++;

        for (int i=0;i<26;i++)
            result += Math.abs(count1[i]-count2[i]);

        return result;
    }
}
