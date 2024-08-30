package stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.pop();

        System.out.println(demo);
        System.out.println(demo.peek());  // Used peek() method
        for(Integer temp:demo){
            System.out.println(temp);
        }

        if(demo.isEmpty()){  // Used isEmpty() method
            System.out.println("Stack is empty");
        }else
            System.out.println("Stack is not empty");

        System.out.println(demo.search(3));  //User Search method

    }
}
