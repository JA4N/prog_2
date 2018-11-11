package Funktionale_Programmierung.Aufwaermuebung.Fußballmanager;

public interface Jahreseinkommen {

    abstract double Jahreseinkommen (int spiele, int tore);

    default double Erfolgsquote (int spiele, int tore){
        return (double)tore / (double)spiele;
    }
}
