package hacker_rank;
import java.util.ArrayList;
import java.util.Scanner;

/*
Input is as display below:-
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Output will be:-
0 1 78 12 23
 */

public class ListPrb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<no;i++){
            arrayList.add(sc.nextInt());
        }

        int nextno = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nextno;i++){
            String type = sc.nextLine();
            if(type.equals("Insert")){
                String[] queryArray = sc.nextLine().split(" ");
                arrayList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                arrayList.remove(removeIndex);
            }
        }

        for(Integer num:arrayList){
            System.out.print(num+" ");
        }
    }
}
