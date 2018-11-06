package Collections_Generics.Uebung_2_1;

public class Person implements Comparable{

    public String nachame;
    public String vorname;
    public int pers_nr;

    public Person (String nachname, String vorname, int pers_nr){
        this.nachame = nachname;
        this.pers_nr = pers_nr;
        this.vorname = vorname;
    }

    public int getPers_nr() {
        return pers_nr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachame(){
        return nachame;
    }

    @Override
    public int compareTo(Object o) {
        //Nach was will ich sortiert haben(get.[...])
        int compareage = ((Person)o).getPers_nr();
        //Für Ascending order
        return this.pers_nr-compareage;
        //Für Descending order
        //return pers_nr-this.compareage;
    }

    @Override
    public String toString(){
        return "Name: " + getVorname() + " ; Nachname: " + getNachame() + " ; Per.Nr.: " + getPers_nr();
    }
}
