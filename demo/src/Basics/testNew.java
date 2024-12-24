package Basics;

public class testNew {
    public static void main(String[] args) {
        int number = 37;
        String romanNumber = intToRoman(number);

        System.out.println("Print the roman numbers"+ romanNumber);
    }

    private static String intToRoman(int number) {
        int[] values = {10,5,1};
        String[] symbols = {"M","CM","D"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++){

            while (number >= values[i]){

                roman.append(symbols[i]);

                number -= values[i];
            }
        }


        return roman.toString();
    }
}
