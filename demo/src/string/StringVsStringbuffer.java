package string;

public class StringVsStringbuffer {
    public static void main(String[] args) {

        String str1 = "Ni";
        String str2 = str1;
        str1 += "May";

        System.out.println(str1 + " Using String " + str2 + " " + (str1==str2));

        StringBuffer sb = new StringBuffer("Ni");
        StringBuffer sb1 = sb;
        sb1.append("May");

        System.out.println(sb + " Using StringBuffer " + sb1 + " " + sb.equals(sb1));
    }
}
