package thread;

class WaitndNotifyDemo{
    static public int balance = 0;

    public void withDraw(int amount) {
        synchronized (this){
            if (balance <= 0) {
                try {
                    System.out.println("Wait for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Current Balance in account is: " + balance);
        System.out.println("Request to withdraw amount is: " + amount);
        balance = balance - amount;
        System.out.println("Withdrawal is sucessfull and Your available balance is: " + balance);
    }

    public void Deposit(int amount){
        System.out.println("Depositing to account");
        balance = balance + amount;
        synchronized (this){
            notify();
        }
    }

    public static void main(String[] args) {
        WaitndNotifyDemo app = new WaitndNotifyDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withDraw(1000);
            }
        });
        t1.setName("Threa1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                app.Deposit(15000);
            }
        });
        t2.setName("Thread2");
        t2.start();
    }
}
