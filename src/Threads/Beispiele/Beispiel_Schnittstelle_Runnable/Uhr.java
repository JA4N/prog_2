package Threads.Beispiele.Beispiel_Schnittstelle_Runnable;

public class Uhr {

    public static void main(String[] args){

        Thread timeThread = new Thread(new Time());

        timeThread.start();
    }
}
