package leetCode;


import java.util.*;

public class testonen {
    public static void main(String[] args) {
        char[] array = {'j', 'a', 'v', 'a'};
        reversen(array);
        System.out.println(array);
    }

    private static void reversen(char[] array) {
        int left = 0; int right = array.length-1;
        while (left < right){
            char temp  = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

    }



}
