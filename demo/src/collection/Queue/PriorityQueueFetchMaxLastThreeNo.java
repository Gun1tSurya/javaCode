package collection.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueFetchMaxLastThreeNo {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 3, 7, 8, 4};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //Add all numbers to maxHeap
        for(int num:numbers){
            maxHeap.add(num);
        }

        int[] top3 = new int[3];

        for(int i=0;i<top3.length;i++){
           top3[i] =   maxHeap.poll();
        }

        // Print the results
        System.out.println("Last 3 highest numbers: ");
        for (int num : top3) {
            System.out.print(num + " ");
        }
    }
}
