package thread;

class MyCounter extends Thread{
        private int threadNo;

        public MyCounter(int threadNo){
            this.threadNo = threadNo;
        }

        public void run(){
            countMe();
        }

    private void countMe() {
            for(int i=0;i<=9;i++){
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Value of i "+ i +"Thread no is "+threadNo);
            }
    }
}


public class ThreadActualTime{
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        counter1.run();
        System.out.println("**********************************************");
        counter2.run();
        Thread.sleep(4505);
        long endTime = System.currentTimeMillis();
        System.out.println("Actual required time for this "+ (endTime - startTime));
    }


}
