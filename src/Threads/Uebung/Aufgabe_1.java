package Threads.Uebung;

public class Aufgabe_1 implements Runnable {

    public int numer;

    public Aufgabe_1(int nummer){
        super();
        this.numer=numer;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int localVariable = Aufgabe_1_Main.globalCounter;
        System.out.print(numer + " ");

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* kritischen Abschnitt schützen: Als Schlüssel dient ein zentrales Objekt (nicht int) */
        synchronized (Aufgabe_1_Main.key) {
            Aufgabe_1_Main.globalCounter = Aufgabe_1_Main.globalCounter + 1;
        }

    }
}
