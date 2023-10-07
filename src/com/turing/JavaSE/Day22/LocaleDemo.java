package JavaSE.Day22;

import java.util.Currency;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale l = Locale.getDefault();
        System.out.println("Locale Country = " + l.getCountry());

        Currency c = Currency.getInstance(l);
        System.out.println("Currency = " + c);
    }
}
