package leetCode;

public class smallestNo {
    public static void main(String[] args) {
        int x=15,y=10,z=5;
        System.out.println(""+getSmallestNo(x,y,z));
    }

    private static int getSmallestNo(int x, int y, int z) {

        int count  = 0;

        while(x!=0 && y!=0 && z!=0){
            x--;
            y--;
            z--;
            count++;
        }
        return count;
    }
}
