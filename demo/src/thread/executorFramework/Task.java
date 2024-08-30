package thread.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
    }
}

class Test{
    public static void main(String[] args) {

        /*for(int i=0;i<10;i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }*/

        // In above scenario we have used 10 threads but what if someone specify thasaunds of thread , it will damange system, slowdown every process
// to overcome above scenario Thread Pool is used.

        //get the count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();

        //Create the pool(Collection of thread)
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        //Submit the task for executions
        for(int i=0;i<100;i++){
            service.execute(new Task());  //Task is submitted to service and it will execute the operation
        }
        /* Within service i.e. Thread pool executors, internally uses blocking queue - for storing all the task which we have submitted.
        10 threads from pool will perform the steps like fetch the next task from queue and execute it
        so 10 thread attempt get the task from queue concurrently that's why we need to handle concurrent operations.
        we want queue to be thread safe.
        */

        System.out.println("Thread Name :" + Thread.currentThread().getName()); //print main thread

        /*
        CPU has only 4 core  i.e. Core-1, Core-2, Core-3, Core-4
        that's why max 4 thread can run at time then non of the thread is waiting for anytime.
        hence we are commenting above - ExecutorService service = Executors.newFixedThreadPool(10);
         */
    }
}

/*
Java provides 4 thread pool:-
1. FixedThreadPool - which we saw above example
2. CacheThreadPool- we saw in FixedThreadPool blocking queue is used here synchronous queue(can hold only 1 task) is used.
catch here is if all threads are busy then create new thread for the task and place it in a pool. since we have 1000 task so it will create
1000 thread, since there are too many threads so CacheThreadPool have ability to kill thread once they have ideal for 60 sec.
// For lot of short lived task
for e.g. - ExecutorService service = Executors.newCachedThreadPool();
3. ScheduledThreadPool - Run the task with some delay or scheduled delay
ExecutorService service = Executors.newScheduledThreadPool(10);
4. SingleThreadedExecutor - same as FixedThreadPool but it has only one thread which is executing and ensure to run sequentialy.
 */


