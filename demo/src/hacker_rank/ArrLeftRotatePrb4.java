package hacker_rank;

import java.util.Scanner;

public class ArrLeftRotatePrb4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        rotateLeft(a,d);
        scanner.close();
    }

    private static int[] rotateLeft(int[] a, int d) {
        for(int i = d;i<a.length;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<d;i++)
            System.out.print(a[i]+" ");
        return a;
    }


}
