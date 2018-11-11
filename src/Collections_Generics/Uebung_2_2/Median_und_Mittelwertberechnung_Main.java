package Collections_Generics.Uebung_2_2;

import java.util.ArrayList;
import java.util.List;

public class Median_und_Mittelwertberechnung_Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(9);
        list.add(2);
        list.add(0);
        list.add(5);
        list.add(8);

        Median_und_Mittelwertberechnung obj  = new Median_und_Mittelwertberechnung(list);

        System.out.println("Durchschnitt: " + obj.mittelwert());
        System.out.println("Mittelwert: " + obj.med());

    }
}