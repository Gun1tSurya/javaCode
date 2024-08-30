package collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        System.out.println(priorityQueue.peek());
       // System.out.println(priorityQueue.element());   RE:NSEE
        for(int i=0;i<=10;i++){
            priorityQueue.offer(i);
        }
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
