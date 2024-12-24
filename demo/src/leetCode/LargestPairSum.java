package leetCode;

public class LargestPairSum {
    public static void main(String[] args) {
        int[] arr = {12,34,10,6,40};
        System.out.print(getLargestPair(arr));
    }

    private static int getLargestPair(int[] arr) {
        int max = 0;
        int secondMax = 0;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                secondMax = Math.max(secondMax,arr[i]);
            }
        }

        return max + secondMax;
    }
}
