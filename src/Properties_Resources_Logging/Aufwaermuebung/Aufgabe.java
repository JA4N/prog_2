package Properties_Resources_Logging.Aufwaermuebung;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Aufgabe {

    public static void main(String[] args) throws IOException {
        //%g: Zahl aufsteigend, wenn Datei schon vorhanden
        String name = "Main_%g.log";

        // Der Konstruktor des FileHandlers nimmt einen Filenamen, eine maximale
        // Filegröße
        // und die Anzahl der zu erstellenden Files. Wenn das 7. File die
        // maximale Größe erreicht
        // hat, wird das 0. gelöscht.
        FileHandler fileHd1 = new FileHandler (name, 5000,7);

        Logger.getLogger("").addHandler(fileHd1);
        Logger logger= Logger.getLogger(Aufgabe.class.getName());

        logger.info("Program started");

        // Alle 20 Sekunden wird eine Ausgabe geloggt.
        // Sie wird auf der Konsole und in Main_ZAHL.log sichtbar.
        try {
            Thread.sleep(5000);
            logger.info("Ausgabe");
        }
        catch (Exception ex)
        {
            logger.severe(ex.getMessage());
        }

        logger.info("Program ended");
    }
}
