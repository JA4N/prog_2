package Collections_Generics.Uebung_2_1;

import java.util.*;
import java.util.ArrayList;

public class Person_Main {

    public static void main(String[] args){

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Heusch","Peter", 5));
        arrayList.add(new Person("Rausch","Aexander", 1));
        arrayList.add(new Person("pado","Ulrike", 4));
        arrayList.add(new Person("Kanuth","Stefan", 2));
        arrayList.add(new Person("mosler","Christoph", 3));

        Collections.sort(arrayList);

        for(Person o: arrayList){
            System.out.println(o);
        }

    }
}
