package Properties_Resources_Logging.Beispiele.Properties;

import java.util.Properties;
import java.util.Enumeration;

public class Beispiel_Systemeigenschaften {

    //Ausgabe der System Properties
    public static void main (String[] args){
        Properties systemProperties = System.getProperties();
        Enumeration<?> enumeration = systemProperties.propertyNames();

        while (enumeration.hasMoreElements()){
            String zaehler = (String) enumeration.nextElement();
            System.out.println("Property " + zaehler + ":" + System.getProperty(zaehler));
        }
    }
}
