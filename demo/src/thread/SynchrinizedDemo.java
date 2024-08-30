package thread;

/*
    There are three types of synchronization happens:-
    1. Using synchronization
    2. Using synchronization block
    3. Using static synchronization

 */

class Brakets{
        // check output first after removing synchronized keyword from below method
        // synchronized  block applies lock on object
        synchronized public void generate(){
            for(int i=0;i<=10;i++){
                if(i<5){
                    System.out.print("[");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println();
        }
}

public class SynchrinizedDemo {
    public static void main(String[] args) {
        Brakets brakets = new Brakets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    brakets.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    brakets.generate();
                }
            }
        }).start();
    }
}
