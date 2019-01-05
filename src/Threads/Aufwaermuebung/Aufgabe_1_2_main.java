package Threads.Aufwaermuebung;

public class Aufgabe_1_2_main{

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        // eigene boolean-Variable isInterrupted - zunächst auf false
                        boolean isInterrupted = false;
                        while (!isInterrupted) {
                            System.out.print("a ");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                // im Falle einer Unterbrechung Variable auf true setzen
                                // - das führt beim nächsten Schleifendurchlauf zum Abbruch
                                isInterrupted = true;
                                System.err.println("Wurde unterbrochen. So kann ich nicht arbeiten!");
                            }
                        }
                    }

                });

        t.start();
        Thread.sleep(2000);
        t.interrupt();

    }
}
