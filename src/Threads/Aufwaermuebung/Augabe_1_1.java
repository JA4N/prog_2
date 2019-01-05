package Threads.Aufwaermuebung;

public class Augabe_1_1 extends Thread{

    @Override
    public void run() {

        while (!isInterrupted()){

            try {
                Thread.sleep(1000);
                System.out.println("Zeichen %d");
            } catch (InterruptedException e) {
                interrupt();
                System.out.println("Interrupted");
            }
        }
    }
}
