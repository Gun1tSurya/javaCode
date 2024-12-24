package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class intersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,6,7};
        int[] nums2 = {2,3,9,8,1,7};

        int[] ans = findIntersection(nums1,nums2);

        for(int x: ans)
            System.out.println(x+" ");
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;
        while (i<nums1.length && j<nums2.length){

            if(nums1[i]<nums2[j])i++;
            else if(nums1[i]>nums2[j])j++;
            else {
                nums1[k++] = nums1[i];
                ++i;
                ++j;
            }
        }

        int[] ans = new int[k];
        for(i=0;i<k;i++){
            ans[i] = nums1[i];
        }

        return ans;
    }
}
