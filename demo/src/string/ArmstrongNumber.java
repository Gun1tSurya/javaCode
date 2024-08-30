package string;

/*
armstrong no are 1,153,370,371,407....
ArmStrong no logic 153:- 1 qube + 5 qube + 3 qube i.e 1+125+27 = 153
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int no = 372;
        int temp = no;
        int length = 0;

        // find-out length of no first
        while(temp != 0){
            temp = temp/10;
            length = length+1;
        }

        //reverse no and then multiply it with length
        int rev,arm=0;
        int temp1 = no;
        while(temp1 != 0){
            rev = temp1%10;
            int mul = 1;
            for (int i=1;i<=length;i++){
                mul = mul * rev;
            }
            arm = arm+mul;
            temp1 = temp1/10;
        }
        if(no == arm){
            System.out.println(no + " is Armstrong no");
        }
        else{
            System.out.println(no + " is Not Armstrong no");
        }
    }
}
