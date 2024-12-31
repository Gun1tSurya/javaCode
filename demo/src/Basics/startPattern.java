package Basics;

/*
 *****
 *    *
 *    *
 *    *
 *****


 */


public class startPattern {
    public static void main(String[] args) {
        int size = 5; // size of square
        for(int row=1;row<=size;row++){
            for(int col=1;col<=size;col++){
                if(row == 1|| row == size
                || col == 1 || col == size) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
