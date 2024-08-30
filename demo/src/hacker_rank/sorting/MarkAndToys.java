package hacker_rank.sorting;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MarkAndToys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }


        System.out.println(maximumToys(prices,k));
    }

    private static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int index = 0;
        for(int i=0;i<prices.length;i++){
            sum += prices[i];
            index = i;
            if(sum>k){
                break;
            }
        }
        return index;
    }
}
