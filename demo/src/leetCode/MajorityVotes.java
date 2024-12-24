package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityVotes {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,1,5,5,5,5,6,6,6,6,6);
       List<Integer> getResult =  calculateVotes(nums);
       for(int result:getResult){
           System.out.print(result+" ");
       }
    }

    private static List<Integer> calculateVotes(List<Integer> nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        int f1 = 0;
        int f2 = 0;


        for(int num:nums){
            if(num == num1){
                f1++;
            }else if(num == num2){
                f2++;
            }else if(f1 == 0){
                num1 = num;
                f1++;
            }else if(f2 == 0){
                num2 = num;
                f2++;
            }else{
                f1--;
                f2--;
            }

        }
        f1 = 0;
        f2 = 0;

        for(int num:nums) {
            if (num == num1) {
                f1++;
            } else if (num == num2) {
                f2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.size();
        if(f1 > n/3){
            res.add(num1);
        }
        if (f2 > n/3) {
            res.add(num2);
        }

        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
