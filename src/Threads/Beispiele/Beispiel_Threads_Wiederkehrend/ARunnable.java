package Threads.Beispiele.Beispiel_Threads_Wiederkehrend;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ARunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from Runnable");

    }
}

class ScheduledAtFixedRate{

    public static void main(String[] args){

        //2: Thread-Pool mit 2 Threads
        ScheduledThreadPoolExecutor sp = new ScheduledThreadPoolExecutor(2);
        //Diesen Thread anch 1 Sekunde alle 2 Sekunden starten!
        sp.scheduleAtFixedRate(new ARunnable(),1, 2, TimeUnit.SECONDS);
    }
        }
