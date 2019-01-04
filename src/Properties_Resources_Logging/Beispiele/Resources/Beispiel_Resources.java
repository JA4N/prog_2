package Properties_Resources_Logging.Beispiele.Resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class Beispiel_Resources {

    public static void main(String[] args){
        Locale currentLocal = new Locale("en");
        ResourceBundle message = ResourceBundle.getBundle("resources/messages", currentLocal);
        System.out.println(message.getString("GUTEN MORGEN"));

    }
}
