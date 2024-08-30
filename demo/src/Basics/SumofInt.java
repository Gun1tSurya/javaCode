package Basics;

public class SumofInt {
    public static void main(String[] args) {
        int no = 10;
        System.out.println(solution(no));
    }

    private static int solution(int no) {
        int sum = 0;
        for(int i=1;i<no;i++){
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
