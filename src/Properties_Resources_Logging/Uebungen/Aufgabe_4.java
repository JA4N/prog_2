package Properties_Resources_Logging.Uebungen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Aufgabe_4 {

    public static void main(String[] args) throws IOException {

        String name = "Main_%g.log";

        // Aufg. 1: Properties lesen und in name bzw. locale ablegen
        Locale locale=new Locale("");

        Properties properties = new Properties();
        try {
            FileInputStream fin = new FileInputStream("default.properties");
            properties.load(fin);
            name=properties.getProperty("de.hftstuttgart.pgm2.logfilename");
            locale= new Locale(properties.getProperty("de.hftstuttgart.pgm2.locale"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Aufg.	2: Resource bundles anlegen und verwenden
        // (resources.messages_en.properties und resources.messages.properties erstellen)
        ResourceBundle messages = ResourceBundle.getBundle("resources/messages", locale);


        // Aufg. 4: Formatter

        // Klasse Formatter ist abstract: Ableiten
        Formatter vFormatter = new Formatter() {
            @Override
            public String format(LogRecord aRecord) {
                // Zeitanzeige in Millisekunden in ein Date umwandeln und dann vorformatieren
                // Man kann auch vRecordDate direkt unten ins String.format eingeben,
                // aber dann wird unten der Format-String sehr lang
                Date vRecordDate = new Date(aRecord.getMillis());
                String vDatePart = String.format("%1$td.%1$tm.%1$tY %1$tH:%1$tM.%1$tS,%1$tL", vRecordDate);

                // Felder einsammeln
                String vClassPart = aRecord.getSourceClassName();

                String vMethodPart = aRecord.getSourceMethodName();

                String vLevel = Integer.toString(aRecord.getLevel().intValue());

                String vMessage = aRecord.getMessage();

                // R�ckgabestring zusammenbauen
                return String.format("%s|%40s|%20s|%s|%s\n", vDatePart, vClassPart, vMethodPart, vLevel, vMessage);
            }
        };

        Logger.getLogger("").getHandlers()[0].setFormatter(vFormatter);

        // Aufwärmaufgabe:
        // Der Konstruktor des FileHandlers nimmt einen Filenamen, eine maximale Filegröße
        // und die Anzahl der zu erstellenden Files. Wenn das 7. File die maximale Größe erreicht
        // hat, wird das 0. gelöscht.
        FileHandler fileHd1 = new FileHandler (name, 50000,7);

        Logger.getLogger("").addHandler(fileHd1);
        Logger logger= Logger.getLogger(Aufgabe_4.class.getName());


        // Aufwärmaufgabe: Alle 20 Sekunden wird eine Ausgabe geloggt.
        // Sie wird auf der Konsole und in Main_ZAHL.log sichtbar.
        try {
            while (true){
                Thread.sleep(2000);

                // Aufg. 3: Konfigurationsdatei jedes Mal neu einlesen
                LogManager.getLogManager().readConfiguration(new FileInputStream("logCfg.txt"));

                // Aufg. 4: Formatter setzen
                for (Handler h : Logger.getLogger("").getHandlers()) {
                    if (h instanceof ConsoleHandler) {
                        h.setFormatter(vFormatter);
                    }
                }

                // Aufg. 2: Ausgabe aus dem ResourceBundle holen
                logger.info(messages.getString("RUNNING"));

            }
        }
        catch (Exception ex)
        {
            logger.severe(ex.getMessage());
        }
        // Aufg. 2: Ausgabe aus dem ResourceBundle holen
        logger.info(messages.getString("DONE"));
    }
}


