package hacker_rank;

import java.util.HashMap;
import java.util.Scanner;

/*
Sample Input:-
6 4
give me one grand today night
give one grand today

Sample Output:-
Yes

Check Duplicates words is not allowed in Note and word should be used from magazine only
 */


public class RansomeNotePrb1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String,Integer> usableWords = magazineMap(magazine);
        for(int i=0;i<note.length;i++){
            if(usableWords.containsKey(note[i]) && usableWords.get(note[i]) > 0){
                usableWords.merge(note[i],-1,Integer::sum);
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static HashMap<String, Integer> magazineMap(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.merge(words[i],1,Integer::sum);
        }
        return map;
    }
}
