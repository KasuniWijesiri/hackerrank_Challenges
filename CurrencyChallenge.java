/*This question asks you to format a given amount of money into four different currency
formats: US, Indian, Chinese, and French. The input is a double-precision number, which
represents an amount of money, and you need to use the NumberFormat class in Java to properly
format that number according to the currency rules of each country.*/

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyChallenge {
    public static void main(String[] args) {

        // Sample input, you can replace it with your own value
        double payment = 12324.134;

        // Creating a NumberFormat instance for US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Creating a custom Locale for India as Java doesn't have a built-in Locale for India
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // Creating a NumberFormat instance for China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // Creating a NumberFormat instance for France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);

        // Output the results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}