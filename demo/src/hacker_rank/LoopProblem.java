package hacker_rank;

import java.util.Scanner;

public class LoopProblem {

    public static void main(String[] args) {
        int a = 0,b=2;
        int calc = a;
        for (int i = 0; i<10; i++) {
               /* if(i%2 == 0){
                    int q = i;
                    int temp1 = a+1*b+q*b;
                    System.out.println(temp1);
                }*/
            calc+=(Math.pow(2,i)*b);
            System.out.print(calc+" ");
            double m = (Math.pow(2,15));
            System.out.println(m);
        }

    }
}
