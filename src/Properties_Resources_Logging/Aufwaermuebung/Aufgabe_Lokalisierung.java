package Properties_Resources_Logging.Aufwaermuebung;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Aufgabe_Lokalisierung {

    public static void main(String[] args) {

        Locale currentLocale = new Locale("en");
        ResourceBundle messages = ResourceBundle.getBundle("resources/messages", currentLocale);

        try {
            System.out.println(messages.getString("GUTEN MORGEN"));
        }
        catch (MissingResourceException e){
            System.out.println("Lokalisierung fehlgeschlagen");
        }
    }
}
