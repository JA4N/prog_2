package Properties_Resources_Logging.Beispiele.Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Beispiel_Logging {

    private static final Logger log = Logger.getLogger(Beispiel_2_Logging.class.getName());

    public static void main (String[] args){

        log.info("Das Programm beginnt");

        try{
            String[] array = {};
            String test = array[0];
        }
        catch (Exception e){
            log.log(Level.SEVERE, "Problem:", e);
        }
        log.info("Programmende");
    }
}
