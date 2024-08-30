package string;

public class RemovingDuplicateFromAnotherString {

    public static void main(String[] args) {

        String str = "This is string";
        String str1 = "somi";
        System.out.println("First String is :" + str);
        System.out.println("Second String is :" + str1);
        char[] ch = new char[256];
        for(int i=0;i<str1.length();i++)
            ch[str1.charAt(i)]++;
        System.out.println("New string is ");
        for(int i=0;i<str.length();i++){
            if(ch[str.charAt(i)] == 0)
                System.out.println(str.charAt(i));
        }
    }
}
