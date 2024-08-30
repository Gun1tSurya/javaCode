package hacker_rank;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Sample Input:-
{}()
({()})
{}(
[]

Sample Output:-
true
true
false
true

 */






public class StackPrb1 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            if(isBallanced(sc.nextLine())){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }

    }

    private static boolean isBallanced(String readline) {
        List<String>closingParan =  Arrays.asList("}", ")", "]");
        boolean isBallanced = true;
        ArrayList<String> stack = new ArrayList<String>();
        if(readline.length()>0){
            for(int i = 0;i<readline.length();i++){
                String readSingleValue = readline.substring(i,i+1);
                if(stack.size() == 0 && closingParan.contains(readSingleValue)){
                    isBallanced=false;
                    break;
                }else{
                    if(readSingleValue.equals("{") || readSingleValue.equals("(") || readSingleValue.equals("[")){
                        stack.add(readSingleValue);
                    } else{
                        String stackParan = stack.get(stack.size()-1);
                        if((stackParan.equals("{") && readSingleValue.equals("}")) || (stackParan.equals("(") && readSingleValue.equals(")") || (stackParan.equals("[") && readSingleValue.equals("]")))) {
                            stack.remove(stack.size()-1);
                        }else{
                            isBallanced = false;
                            break;
                        }
                    }
                }
            }
        }
        if(stack.size()>0) isBallanced = false;
        return isBallanced;
    }


}
