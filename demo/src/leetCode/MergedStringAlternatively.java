package leetCode;

public class MergedStringAlternatively {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        
        System.out.println(MergeString(word1,word2));
    }

    private static String MergeString(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int i = 0;
        int j = 0;

        while (i<word1.length() && j<word2.length()){
            if(flag){
                sb.append(word1.charAt(i));
                i++;
            }else{
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }

        while (i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}
