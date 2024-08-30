package thread;

public class NeedofSyncronization {
    public static  int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=1000;i++) {
                    NeedofSyncronization.counter++;
                }
                System.out.println("Execution of first thread is over:");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    NeedofSyncronization.counter++;
                }
                System.out.println("Execution of second thread is over:");
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(3000);
        System.out.println("Value of thread counter: "  + NeedofSyncronization.counter);
    }
}
