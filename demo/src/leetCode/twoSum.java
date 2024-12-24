package leetCode;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {

        int[] nums = {2,1,11,7};
        int target = 9;
        //System.out.println(calculateTwoSum(nums,target));
        int[] ans  = optimalApproach(nums,target);
        for(int a:ans){
            System.out.println(a+" ");
        }
    }

    private static int[] optimalApproach(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i< nums.length;i++){

            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }

    private static int[] calculateTwoSum(int[] nums, int target) {
        int[] result = new int[2] ;
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
