package string;

public class MaxOccureCharFromString {
    public static void main(String[] args) {
        String str = "test string";
        System.out.println("Given string is : " + str);
        char[] ch = str.toCharArray();
        int i=0, j=0, counter = 0;
        int l = str.length();

        for(i=0;i<l;i++){
            counter = 0;
            for(j=0;j<l;j++){
                if(ch[i] == ch[j]){
                    counter++;
                }
            }
            System.out.println("the character: "+ ch[i] +" is present "+counter+" times");
        }
    }
}
