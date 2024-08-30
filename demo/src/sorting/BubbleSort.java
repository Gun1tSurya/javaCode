package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {36,19,29,12,5};
        int temp;
        for(int i =0;i<input.length; i++){
            int flag = 0;
            // if we use -1 below it will reduce time of thousand no. of input is provided(last no is not considered)
            for(int j=0;j<input.length-1;j++){
                if(input[j] > input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }

        for(int i=0;i<input.length;i++){
            System.out.println(input[i] + " ");
        }
    }
}
