package hacker_rank;

public class ArrayRotation {

    public static void main(String[] args) {
        ArrayRotation rotation = new ArrayRotation();
        int arr[] = {1,2,3,4,5,6,7};
        rotation.rotateLeft(arr,2,7);
        rotation.print(arr,7);
    }

    private void print(int[] arr, int no) {
            for(int i=0;i<no;i++){
                System.out.print(arr[i] + " ");
            }
    }

    private void rotateLeft(int[] arr, int d, int no) {
            for(int i=0; i<d;i++)
                rotateLeftByOne(arr,no);
    }

    private void rotateLeftByOne(int[] arr, int no) {
            int temp,i;
            temp = arr[0];
            for(i=0;i<no-1;i++)
                 arr[i] = arr[i+1];
            arr[i] = temp;
    }
}
