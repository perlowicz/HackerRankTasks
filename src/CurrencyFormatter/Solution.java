package CurrencyFormatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        convert(
                Double.parseDouble(bufferedReader.readLine())
        );
    }

    private static void convert(double payment){
        Locale[] locales = {
                Locale.US,
                new Locale("hi","IN"),
                Locale.CHINA,
                Locale.FRANCE
        };

        for (Locale locale : locales) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            String format = currencyInstance.format(payment);
            if (locale.getDisplayCountry().equals("United States"))
                System.out.println("US: " + format);
            else if (locale.getDisplayCountry().equals("India")) {
                format = "Rs." + format.replaceAll("[^0-9.,]","");
            }
            System.out.println(locale.getDisplayCountry() + ": " + format);
        }
    }
}
