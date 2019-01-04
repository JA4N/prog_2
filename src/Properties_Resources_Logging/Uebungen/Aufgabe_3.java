package Properties_Resources_Logging.Uebungen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Aufgabe_3 {

    public static void main(String[] args) throws IOException{

        String name = "Main_%g.log";

        // Aufg. 2: Properties lesen und in name bzw. locale ablegen
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

        // Aufg.	3: Resource bundles anlegen und verwenden
        // (resources.messages_en.properties und resources.messages.properties erstellen)
        ResourceBundle messages = ResourceBundle.getBundle("resources/messages", locale);


        // Hausaufgabe:
        // Der Konstruktor des FileHandlers nimmt einen Filenamen, eine maximale Filegröße
        // und die Anzahl der zu erstellenden Files. Wenn das 7. File die maximale Größe erreicht
        // hat, wird das 0. gelöscht.
        FileHandler fileHd1 = new FileHandler (name, 50000,7);

        Logger.getLogger("").addHandler(fileHd1);
        Logger logger= Logger.getLogger(Aufgabe_3.class.getName());


        // Hausaufgabe: Alle 20 Sekunden wird eine Ausgabe geloggt.
        // Sie wird auf der Konsole und in Main_ZAHL.log sichtbar.
        try {
            while (true){
                Thread.sleep(2000);

                // Aufg. 3: Ausgabe aus dem ResourceBundle holen
                logger.info(messages.getString("RUNNING"));

            }
        }
        catch (Exception ex)
        {
            logger.severe(ex.getMessage());
        }
        // Aufg. 3: Ausgabe aus dem ResourceBundle holen
        logger.info(messages.getString("DONE"));
    }
}
