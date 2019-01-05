package Threads.Uebung;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Aufgabe_1_Main extends Thread{
    public static final int MAX_THREADS = 4;
    public static int globalCounter = 0;

    // Schlüsselobjekt für die Synchronisierung: existiert ein Mal, ist ein Objekt
    // (Object key = new Object() ginge auch)
    public static Aufgabe_1_Main key = new Aufgabe_1_Main();

    public static void main(String[] args) throws InterruptedException {

        //Threads der Anzhal MAX_THREADS wird erzeugt
        Thread[] threads = new Thread[MAX_THREADS];

        for(int i = 0; i < MAX_THREADS; i++){
            threads[i] = new Thread(new Aufgabe_1(i));
            threads[i].start();
        }

        for(int i = 0; i <MAX_THREADS; i++){
            threads[i].join();
        }
        // Kritischen Abschnitt schützen:
        // als Schlüssel dient ein zentrales Objekt (kein int)
        synchronized (key) {
            System.out.println("\nglobalCounter = " + globalCounter);
        }

    }


}
