package string;

public class StringPermutation {


    public static void main(String[] args) {

        String str = "PQR";
        permutation(str);
    }

    private static void permutation(String str) {
        System.out.println("Given string for permutation is " + str);
        showPermutation(str, "");
    }

    private static void showPermutation(String str, String newstr) {
        if (newstr.length() == str.length()) {
            System.out.println(newstr); //why it is decrease by 1 always
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            showPermutation(str, newstr + str.charAt(i));
        }

    }
}
