package leetCode;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,4,7,1,7,9};

        System.out.println(checkDuplicate(nums));
    }

    private static boolean checkDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i=0;i< nums.length;i++){
            set.add(nums[i]);
        }

        if(set.size() < nums.length){
            return true;
        }
        return false;
    }

}
