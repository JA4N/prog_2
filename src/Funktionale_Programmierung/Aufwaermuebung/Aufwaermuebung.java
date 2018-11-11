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

        //Aufgabe 1
        Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);
        list.sort(comparator);
        System.out.println("----------Aufgabe 1----------");
        list.stream().forEach(s -> System.out.println(s));

        //Aufgabe 2
        Comparator<String> comparator2 = String::compareTo;
        list.sort(comparator2);
        System.out.println("----------Aufgabe 2----------");
        list.stream().forEach(s -> System.out.println(s));

        //Aufgabe 3
        System.out.println("----------Aufgabe 3----------");
        list.sort((String s5, String s6) -> s5.compareTo(s6));
        list.stream().forEach(s -> System.out.println(s));

        //Aufgabe 5
        System.out.println("----------Aufgabe 5----------");
        list.stream().sorted((String s7, String s8) -> s7.compareTo(s8)).forEach((s) -> System.out.println(s));

        //Aufgabe 6
        System.out.println("----------Aufgabe 6----------");
        list.stream().sorted((String s9, String s10) -> s10.compareTo(s9)).forEach((s) -> System.out.println(s));


    }
}
