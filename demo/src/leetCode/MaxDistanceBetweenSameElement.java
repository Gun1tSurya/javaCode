package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MaxDistanceBetweenSameElement {
    public static void main(String[] args) {

        int[] arr = {5,2,2,2,1,3,2,3,1};
        System.out.println(getMaxDistance(arr));
    }

    private static int getMaxDistance(int[] arr) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                result = Math.max(result,i-map.get(arr[i]));
            }else{
                map.put(arr[i],i);
            }
        }


        return result;
    }

}
