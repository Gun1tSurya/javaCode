package hacker_rank;


import java.util.Scanner;

public class ArrayPrb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int a[] = new int[no];

        for(int i=0;i<no;i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
