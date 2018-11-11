package Funktionale_Programmierung.Aufwaermuebung.Fußballmanager2;

import java.util.ArrayList;
import java.util.List;

public class Fußballmanager2 {

    public static void main(String[] args) {

        List<Spieler> spieler = new ArrayList<>();

        spieler.add(new Spieler ("Ralf", "FCB", 25, 13, (spiele, tore) -> {return (spiele*10000 + tore*20000);}));
        spieler.add(new Spieler ("Jan", "FC Köln", 22, 3, (spiele, tore) -> {return (spiele*12000 + tore*10000);}));
        spieler.add(new Spieler ("Ludwig", "FCB", 23, 1, (spiele, tore) -> {return (spiele*8000 + tore*10000);}));
        spieler.add(new Spieler ("Ken", "FCB", 25, 4, (spiele, tore) -> {return (spiele*5000 + tore*26000);}));
        spieler.add(new Spieler ("Christian", "FC Köln", 22, 14, (spiele, tore) -> {return (spiele*10000 + tore*15000);}));
        spieler.add(new Spieler ("Klaus", "FCB", 3, 23, (spiele, tore) -> {return (spiele*15000 + tore*21000);}));
        spieler.add(new Spieler ("Robert", "FCB", 15, 11, (spiele, tore) -> {return (spiele*12000 + tore*2000);}));
        spieler.add(new Spieler ("Thomas", "FCB", 8, 0, (spiele, tore) -> {return (spiele*10000 + tore*28000);}));
        spieler.add(new Spieler ("Hans", "HSV", 45, 8, (spiele, tore) -> {return (spiele*6000 + tore*30000);}));
        spieler.add(new Spieler ("Peter", "FCB", 21, 3, (spiele, tore) -> {return (spiele*8000 + tore*25000);}));

        spieler.forEach(Fußballmanager2::printSpielerDetails);

        System.out.println("------Die drei best bezahlsten Spieler------");

        spieler.stream().
                filter((x) -> x.getVerein().equals("FCB")).
                sorted((x, y) -> {if(x.getEinkommen()==y.getEinkommen()) return 0;
                                    else if(x.getEinkommen()<y.getEinkommen()) return 1;
                                    else return -1;}).limit(3).
                forEach(Fußballmanager2::printSpielerDetails);

    }



    public static void printSpielerDetails (Spieler s) {
        System.out.println("Der Spieler " + s.getName() + " vom " + s.getVerein() +
                " verdient in diesem Jahr " + s.getEinkommen() + " Euro.");
    }

}
