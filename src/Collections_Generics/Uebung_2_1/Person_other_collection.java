package Collections_Generics.Uebung_2_1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Person_other_collection {

    public static void main(String[] args) {

        SortedSet<Person> set = new TreeSet<>();

        set.add(new Person("Heusch","Peter", 5));
        set.add(new Person("Rausch","Aexander", 1));
        set.add(new Person("pado","Ulrike", 4));
        set.add(new Person("Kanuth","Stefan", 2));
        set.add(new Person("mosler","Christoph", 3));

        //Iterating over the persons in the set
        Iterator it = set.iterator();

        while(it.hasNext()){
            Person pers = (Person)it.next();
            System.out.println(pers);
        }
    }

}
