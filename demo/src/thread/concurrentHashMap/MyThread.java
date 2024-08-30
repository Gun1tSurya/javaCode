package thread.concurrentHashMap;


import java.util.*;

public class MyThread extends Thread{
    static ArrayList list = new ArrayList<>();

    public void run(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("Child thread updating thread");
        list.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");

        Thread thread = new Thread();
        thread.start();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s1 = (String) iterator.next();
            System.out.println("Main thread iterating List and child thread modifying"+ s1);
            Thread.sleep(1000);
        }
        System.out.println(list);
    }
}


