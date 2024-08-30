package array;

public class RemoveDuplicatesElementfromSortedArray {

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,5,6,6,6,7,8,8,9};
        int[] temp = new int[a.length];

        System.out.println("Below is the initial size of array");
        for(int i = 0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i] != a[i+1]){
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length-1];
        System.out.println("\nAfter removing duplicates");
        for(int i=0;i<temp.length;i++){
             System.out.print(temp[i]+" ");
        }
    }

}
