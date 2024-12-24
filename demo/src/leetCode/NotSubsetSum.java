package leetCode;

public class NotSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.print(getNotSubsetSum(arr));
    }

    private static int getNotSubsetSum(int[] arr) {
        int ans = 1;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i] > ans){
                return ans;
            }else{
                ans += arr[i];
            }

        }

        return ans;
    }
}
