package Funktionale_Programmierung.Aufwaermuebung.Fußballmanager;

public class Spieler {

    private String name;
    private String verein;
    private int spiele;
    private int tore;
    public Jahreseinkommen jahreseinkommen;

    public Spieler() {

    }

    public Spieler (String name, String verein, int spiele, int tore, Jahreseinkommen jahreseinkommen){
        this.tore = tore;
        this.spiele = spiele;
        this.name = name;
        this.verein = verein;
        this.jahreseinkommen = jahreseinkommen;
    }

    public String getVerein() {
        return verein;
    }

    public String getName() {
        return name;
    }

    public double getErfolgsquote() {
        return jahreseinkommen.Erfolgsquote(spiele, tore);
    }

    public double getEinkommen() {
        return jahreseinkommen.Jahreseinkommen(spiele, tore);
    }

    public int getTore() {
        return tore;
    }

    public int getSpiele() {
        return spiele;
    }

    @Override
    public String toString(){
        return "Der Spieler " + getName() + " Vom Verein " + getVerein() + " hat eine Erfolgsquote von " + getErfolgsquote() + " und verdient " + getEinkommen() + "€";
    }
}
