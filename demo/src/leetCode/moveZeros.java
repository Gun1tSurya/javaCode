package leetCode;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroLogic(nums);
    }

    private static void moveZeroLogic(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                swapNo(nums,index++,i);
            }
        }
    }

    private static void swapNo(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
