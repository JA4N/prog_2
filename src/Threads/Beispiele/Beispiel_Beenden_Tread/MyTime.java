package Threads.Beispiele.Beispiel_Beenden_Tread;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTime extends Thread{

    @Override
    public void run() {
        while(true){
            GregorianCalendar calendar = new GregorianCalendar();
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY + calendar.get(Calendar.MINUTE)));

            try{
                //Der Interrupt unterbricht den Thread vermutlich beim schlafen
                //Durch die Unterbrechung wird das interne Flag zurückgesetzt
                //Das Abbruchflag muss im catch-Zweig neu gestartet werden!
                Thread.sleep(100);
            } catch (InterruptedException e) {
                interrupt();
                System.out.println("Interrupted");
            }
        }

    }
}
