package Properties_Resources_Logging.Beispiele.Logging;

import java.util.logging.*;

public class Beispiel_2_Logging {

    private static Logger logger = Logger.getLogger("de.stuttgart.hft.loggerhandler");

    public static void main (String[] args){

        logger.setUseParentHandlers(false);
        ConsoleHandler ch = null;

        for (Handler handler: logger.getHandlers()) {
            if (handler instanceof ConsoleHandler) {
                ch = (ConsoleHandler) handler;
            }
        }

        if (ch == null){
            ch = new ConsoleHandler();
            logger.addHandler(ch);
        }
        logger.setLevel(Level.FINEST);
        ch.setLevel(Level.FINE);

        logger.fine("doing stuff");
        logger.warning("trouble message");
        logger.fine("done");
    }
}
