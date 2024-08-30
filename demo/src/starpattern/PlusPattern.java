package starpattern;

public class PlusPattern {
    public static void main(String[] args) {
        String str = "abc new";
        String newstr =  str.replace(" - "," ");
        System.out.println(newstr);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j==2 || i==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
