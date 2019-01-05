package Threads.Beispiele.Beispiel_Beenden_Tread;

public class MyClock {

    public static void main(String[] args) throws InterruptedException {

        MyTime myTime = new MyTime();
        myTime.start();

        Thread.sleep(5000);
        myTime.interrupt();
    }
}
