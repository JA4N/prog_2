package Threads.Beispiele.Beispiel_Ableiten_Klasse_Thread;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time extends Thread{

    //run() - Methode muss überschrieben werden.
    @Override
    public void run() {
        while (true){
            GregorianCalendar calendar = new GregorianCalendar();
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + calendar.get(Calendar.MINUTE)
                                            + calendar.get(Calendar.SECOND));
        }
        /*try{
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
