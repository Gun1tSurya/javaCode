package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.asList(0,1,1,2,1,0,2,1);

        int i = 0; // 1's area
        int j = 0; // 0's area
        int k = 0; // 2's area

        while(i<=k){
            switch (arr.get(i)){
                case 0:
                    int temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                    ++i;
                    ++j;
                case 1:
                    ++i;
                case 2:
                    temp = arr.get(i);
                    arr.set(i,arr.get(k));
                    arr.set(k,temp);
                    --k;
            }

        }
    }

}
