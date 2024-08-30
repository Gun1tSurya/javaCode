package thread;

import java.util.Random;

class MyCounterNew implements Runnable {

    private int threadNo;

    public MyCounterNew(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i=0;i<=9;i++){
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Value of i " + i + " thread no is " + threadNo);
        }
    }
}


public class ThreadUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        /*Thread t1 = new Thread(new MyCounterNew(1));
        Thread t2 = new Thread(new MyCounterNew(2));

        t1.start();
        t2.start();*/


        //another way to execute using thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }
        ).start();
    }
}
