package thread;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Printing value using thread concept: " + i);
                }
            }
        });
        thread.start();


    }
}
