package string;

public class FirstNonRepeatingCharFromString {
    public static void main(String[] args) {

        String str = "abcba";


        for(int i =0;i<str.length();i++){
            boolean unique = true;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) ==str.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println("First duplicate is : "+ str.charAt(i));
                break;
            }
        }

    }
}
