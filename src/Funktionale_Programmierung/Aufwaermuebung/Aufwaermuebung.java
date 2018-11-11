package Funktionale_Programmierung.Aufwaermuebung;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Aufwaermuebung {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Gregor");
        list.add("Theodor");
        list.add("Margarete");
        list.add("Heide");

        Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);
        list.sort(comparator);
    
        list.stream().forEach(s -> System.out.println(s));
    }
}
