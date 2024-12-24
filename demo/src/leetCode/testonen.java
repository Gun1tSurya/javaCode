package leetCode;


public class testonen {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};

        char ans = reverseCharOperations(ch);
        System.out.println(reverseCharOperations(ch));
    }

    private static char reverseCharOperations(char[] ch) {
        int a_pointer = 0;
        int b_pointer = ch.length-1;
        char temp = 0;

        while(a_pointer <= b_pointer){
            temp = ch[a_pointer];
            ch[a_pointer] = ch[b_pointer];
            ch[b_pointer] = temp;

            a_pointer += 1;
            b_pointer -= 1;
        }
        return temp;
    }


}
