package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str  = "Given string for reverse";

        String[] words = str.split(" ");
        for(int i=words.length - 1;i>=0;i--){
            System.out.println(words[i]);
        }
    }
}

