package Properties_Resources_Logging.Beispiele.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Beispiel_Einlesen {

    public static void main(String[] args){

        Properties properties = new Properties();

        try{
            FileInputStream fis = new FileInputStream("spezielleProperties.prp");
            properties.load(fis);

            Set <Object> keys = properties.keySet();

            for(Object key: keys){
                System.out.println(key + "hat den Wert " + properties.getProperty(key.toString()));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
