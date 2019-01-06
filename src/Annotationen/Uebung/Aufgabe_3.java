package Annotationen.Uebung;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Aufgabe_3 {

    public static void main(String[] args) {
        //In die Methode createInsert wird die Klasse Person übergeben
        //Der return wird dann in der syso ausgegeben
        System.out.println(createInsert(Person.class));
    }

    public static String createInsert(Class clasz) {
        //Methode mit der Übergebenen Peron - Klasse
        Table tabelle = (Table) clasz.getAnnotation(Table.class);
        //Prüfung, ob tabelle = null ist
        if ( tabelle == null )  {
            return null;
        }
        //Für Ansicht
        String prefix = "INSERT INTO " + tabelle.value();
        String infix = " (";
        String postfix = " VALUES (";
        String separator = "";

        for (Field field: clasz.getFields()) {
            for (Annotation annotation: field.getAnnotations()) {
                if ( ! (annotation instanceof Column) ) {
                    continue;
                }
                Column spalte = (Column)annotation;
                infix = infix + separator + spalte.value();
                postfix = postfix + separator + "?";
                separator = ",";
            }
        }

        infix = infix + ")";
        postfix = postfix + ")";

        return prefix + infix + postfix;
    }
}
