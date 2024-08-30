package Basics;


public class RomanToDecimal {
    public static void main(String[] args) {
        String roman = "XXI";
        System.out.println(decode(roman));
    }

    private static int decode(String roman) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumber = roman.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
        for (int x = romanNumber.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumber.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = getDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = getDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = getDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = getDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = getDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = getDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = getDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

        public static int getDecimal(int decimal, int lastNumber, int lastDecimal) {
            if (lastNumber > decimal) {
                return lastDecimal - decimal;
            } else {
                return lastDecimal + decimal;
            }
        }
}
