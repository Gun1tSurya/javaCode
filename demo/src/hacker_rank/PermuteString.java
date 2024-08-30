package hacker_rank;

public class PermuteString {
    public static void main(String[] args) {
        PermuteString pm = new PermuteString();
        System.out.println(pm.checkInclusion("aitia","dcaItiaba"));
    }

    private boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            return false;
        }

        int[] count = new int[26];
        for(int i=0;i<len1;i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        if(checkZero(count)){
            return true;
        }

        for(int i=len1;i<len2;i++){
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if(checkZero(count))
                return true;
        }

        return false;
    }

    private boolean checkZero(int[] count) {
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }
            return true;
    }
}
