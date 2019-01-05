package Threads.Beispiele.Beispiel_Schnittstelle_Runnable;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time implements Runnable{

    @Override
    public void run() {
        while (true){
            GregorianCalendar calendar = new GregorianCalendar();
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY + calendar.get(Calendar.MINUTE)));
        }
        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
