package Properties_Resources_Logging.Beispiele.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Beispiel_setzen_und_abspeichern {
    //Wegschreiben der Properties
    public static void main(String[] args){

        try {
            Properties properties = new Properties();

            properties.setProperty("Beispiel 1", "Beispiel 2");
            properties.setProperty("Beispiel 3", "Beispiel 4");

            FileOutputStream fos = new FileOutputStream("spezielle Properties");

            properties.store(fos, "spezielle Kundenfaults");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
