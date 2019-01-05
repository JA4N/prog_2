package Threads.Aufwaermuebung;

public class Aufgabe_1_1_Main {

    public static void main(String[] args)throws InterruptedException{

        Augabe_1_1 augabe_1_1 = new Augabe_1_1();
        augabe_1_1.start();

        //Es wird nochmal 2Sek. gewartet bis Abgebrochen wird
        Thread.sleep(2000);
        augabe_1_1.interrupt();


    }
}
