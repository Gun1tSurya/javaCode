package Java_Practice.accessspecifier;

public class Profile {
    private Profile(int w){
        System.out.println(w);
    }
    /*public  static Profile(){
        System.out.println();
    }*/
    public static void main(String[] args) {
        Profile obj = new Profile(50);
    }
}
