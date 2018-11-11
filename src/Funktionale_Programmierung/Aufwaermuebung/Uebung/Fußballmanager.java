package Funktionale_Programmierung.Aufwaermuebung.Uebung;

import java.util.ArrayList;
import java.util.List;

public class Fußballmanager {

    public static void main(String[] args){

        List<Spieler> list = new ArrayList<>();

        list.add(new Spieler("Lindheimer", "VFB", 25, 49, (spiele, tore)  ->{ int einkommen = spiele*100;
                                                                                                            einkommen = einkommen + tore*250;
                                                                                                            if(tore>10)einkommen = einkommen + tore*350;
                                                                                                            return einkommen;}));
        list.add(new Spieler("Müller", "FCB", 25, 13, (spiele, tore)  ->{return (spiele*10000 + tore*20000);}));
        list.add(new Spieler("Podolski", "FC Köln", 25, 13, (spiele, tore) -> {return (spiele*5000 + tore*25000);}));
        list.add(new Spieler("Mosler", "TF Feuerbach", 200, 1, (spiele, tore) -> {return (spiele*0 + tore*5);}));

        list.stream().forEach((s) -> System.out.println(s));


    }
}
