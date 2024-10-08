package hacker_rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencySymbolConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        Locale localInd = new Locale("en","IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(localInd);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("INDIA: " + india.format(payment) );
        System.out.println("CHINA: " + china.format(payment));
        System.out.println("FRANCE: " + france.format(payment));

    }
}
