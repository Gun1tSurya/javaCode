package tree;

import java.io.*;

class Result{
    public  static int findParent(int processNumber){
        int start_number = 1;
        boolean flag = true;
        int intialNum = 0, curentlevel = 0;
        for(int i=0;i<processNumber;i++){
            while (intialNum >= 0) {
                if(start_number==processNumber) {
                    System.out.println(start_number+"==="+curentlevel);
                    flag=false;
                    break;
                }
                start_number++;
                intialNum--;
            }
            if(flag==false)
                break;
            curentlevel ++;
            intialNum =i;
        }
        return curentlevel;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int processNumber = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.findParent(processNumber);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
