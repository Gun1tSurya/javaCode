package string;

public class SplitStringEqually {
    public static void main(String[] args) {

        String str = "asdgahgalkgalasdgt";
        int splitnum = 3;
        splitString(str,splitnum);
    }

    private static void splitString(String str, int splitnum) {
        int part_size;
        if(str.length() % splitnum != 0){
            System.out.println("Please provide correct string");
            return;
        }else{
            part_size = str.length()/splitnum;
            for(int i=0;i<str.length();i++){
                if(i%part_size == 0)
                    System.out.println();
                System.out.println(str.charAt(i));
            }
        }
    }
}
