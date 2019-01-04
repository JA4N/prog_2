package Properties_Resources_Logging.Uebungen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Aufgabe_1 {

    public static void main(String[] args) throws IOException {
        //%g: Zahl aufsteigend, wenn Datei schon vorhanden
        String name = "Main_%g.log";

        //Propertie einlesen
        Properties properties = new Properties();
        Locale locale = new Locale("");

        try {
            FileInputStream fileInputStream = new FileInputStream("src/default.properties");
            properties.load(fileInputStream);
            name = properties.getProperty("de.hftstuttgart.pgm2.logfilename");
            locale = new Locale (properties.getProperty("de.hftstuttgart.pgm2.locale"));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
