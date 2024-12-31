package leetCode;

public class reverseChar {
    public static void main(String[] args) {
        char[] array = {'j', 'a', 'v', 'a'};
        reverse(array);
        System.out.println(array);
    }

    public static void reverse(char[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
