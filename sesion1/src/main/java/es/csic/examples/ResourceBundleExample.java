package es.csic.examples;

import java.math.BigDecimal;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

    public static void main(String[] args) {
        ResourceBundle esBundle = ResourceBundle.getBundle("resourceBundles.resource", new Locale("es"));
        ResourceBundle usBundle = ResourceBundle.getBundle("resourceBundles.resource", Locale.US);

        esBundle.keySet().forEach(k -> System.out.println(k + ": " + esBundle.getString(k)));
        usBundle.keySet().forEach(k -> System.out.println(k + ": " + usBundle.getString(k)));
    }
}

class Resource_es_ES extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"moneda", "moneda"},
                {"ratio", new BigDecimal("3.401")},
                {"ciudades", new String[] { "Madrid", "Sevilla"}}
        };
    }
}
