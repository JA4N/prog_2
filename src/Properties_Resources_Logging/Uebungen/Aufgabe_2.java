package Properties_Resources_Logging.Uebungen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Aufgabe_2 {


    public static void main(String[] args) throws IOException {

        String name = "Main_%g.log";

        // Aufg. 1: Properties lesen und in name bzw. locale ablegen
        Locale locale=new Locale("");

        Properties properties = new Properties();
        try {
            FileInputStream fin = new FileInputStream("src/default.properties");
            properties.load(fin);
            name=properties.getProperty("de.hftstuttgart.pgm2.logfilename");
            locale= new Locale(properties.getProperty("de.hftstuttgart.pgm2.locale"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Aufg.	2: Resource bundles anlegen und verwenden
        // (resources.messages_en.properties und resources.messages.properties erstellen)
        ResourceBundle messages = ResourceBundle.getBundle("resources/messages", locale);
    }
}

