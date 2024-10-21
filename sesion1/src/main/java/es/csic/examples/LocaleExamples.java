
package es.csic.examples;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleExamples {

    public static void main(String args[])
    {
        // Set up specific locale
        Locale localeES = new Locale.Builder()
                .setLanguage("es")
                .setRegion("ES")
                .setVariant("POSIX")
                .build();

        Locale localeES2 = new Locale("es", "ES");

        // Default locale
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.GERMANY);
        Locale usLocale = Locale.US;

        // Format using locale
        double number = 102300.456d;
        NumberFormat usNumberFormat = NumberFormat.getInstance(usLocale);
        NumberFormat esNumberFormat = NumberFormat.getInstance(localeES);

        System.out.println("Formato original: "+ number);
        System.out.println("Formato US: " + usNumberFormat.format(number).toString());
        System.out.println("Formato ES: " + esNumberFormat.format(number).toString());

        Locale.setDefault(Locale.US);
        LocalDateTime localDateTime = LocalDateTime.of(2023, 5, 24, 11, 15, 20, 100);
        String pattern = "dd-MMMM-yyyy HH:mm:ss.SSS";

        // Format dates
        DateTimeFormatter defaultTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        DateTimeFormatter deTimeFormatter = DateTimeFormatter.ofPattern(pattern, Locale.GERMANY);
        DateTimeFormatter esTimeFormatter = DateTimeFormatter.ofPattern(pattern, localeES);

        System.out.println("Formato US: " + defaultTimeFormatter.format(localDateTime).toString());
        System.out.println("Formato DE: " + deTimeFormatter.format(localDateTime).toString());
        System.out.println("Formato ES: " + esTimeFormatter.format(localDateTime).toString());

    }
}
