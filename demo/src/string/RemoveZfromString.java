package string;

public class RemoveZfromString {
    public static void main(String[] args) {

        String str = "zoolozy";
        System.out.println("Given string before act on it : " + str);
        System.out.println(removeZlogic(str));
    }

    private static String removeZlogic(String str) {
        int len = str.length();
        String newStr = "";
        for(int i=0;i<len;i++){
            char temp = str.charAt(i);
            if(!(i>0 && i< len-1 && temp == 'z'))
                newStr = newStr + temp;
        }
        return newStr;
    }
}
