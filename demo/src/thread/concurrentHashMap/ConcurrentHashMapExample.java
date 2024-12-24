package thread.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        Thread writeThread1 = new Thread(()-> {
            for(int i=1;i<=5;i++){
                map.put("Key"+i,i);
                System.out.println("Thread 1 added: key"+ i +"->"+ i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

            }
        });

        Thread writeThread2 = new Thread(() ->{
           for(int i=6;i<=10;i++){
               map.put("Key"+i,i);
               System.out.println("Thread 2 added: key"+ i +"->"+ i);

               try {
                   Thread.sleep(150);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }

        });

        Thread readerThread = new Thread(()-> {

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for(String key:map.keySet()){
                System.out.println("Reader thread:"+ key +"->"+map.get(key));
            }
        });


        //start all threads
        writeThread1.start();
        writeThread2.start();
        readerThread.start();

        // Join threads to wait for their completion
        try {
            writeThread1.join();
            writeThread2.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final ConcurrentHashmap:"+ map);
    }
}
