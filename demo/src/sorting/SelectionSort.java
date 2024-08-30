package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] a = {38,52,2,43,23,36,5};
        int temp = 0;
        int min ;
        for(int i= 0;i<a.length;i++){
            min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
