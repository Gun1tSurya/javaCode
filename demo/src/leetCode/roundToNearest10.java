package leetCode;

public class roundToNearest10 {
    public static void main(String[] args) {
        String str = "15";
        System.out.println(checkthelogic(str));
    }

    private static String checkthelogic(String str) {

        int n = str.length();
        if(str.charAt(n-1) < 5){
            return str.substring(0,n-1)+"0";
        }

        StringBuilder sb = new StringBuilder(str);
        int i = n-2;
        sb.setCharAt(n-1,'0');
        while (i>=0 && sb.charAt(i) == '9'){
            sb.setCharAt(i,'0');
            --i;
        }
        if(i<0){
            sb.insert(0,'1');
        }else{
            sb.setCharAt(i, (char) (sb.charAt(i)+1));
        }

        return sb.toString();
    }
}
