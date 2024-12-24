package leetCode;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,9};

        int[] ans = calculatePlusOne(digits);
        for(int x:ans){
            System.out.println(x+" ");
        }
    }

    private static int[] calculatePlusOne(int[] digits) {

        int n = digits.length;

        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;

    }
}
