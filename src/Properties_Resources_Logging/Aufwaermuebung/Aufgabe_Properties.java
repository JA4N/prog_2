package Properties_Resources_Logging.Aufwaermuebung;

import com.sun.javafx.runtime.SystemProperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Aufgabe_Properties {

    //Auslesen der Systemproperties
    public static void main(String[] args) {
        try {
            Properties systemProperties = System.getProperties();

            System.out.println(systemProperties.getProperty("os.name"));
            //File wird erzeugt
            FileOutputStream file = new FileOutputStream("syso.properties");
            //File wird geschrieben
            systemProperties.store(file, "Systemproperties der JVM");

            //XML-File wird erzeugt und geschrieben
            FileOutputStream fileXML = new FileOutputStream("syso.properties.xml");
            systemProperties.storeToXML(fileXML, "Systemproperties der JVM");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

