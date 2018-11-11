package Collections_Generics.Uebung_2_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Median_und_Mittelwertberechnung<T extends Number> {

    List<T> liste;

    public Median_und_Mittelwertberechnung(){
        liste = new ArrayList<>();
    }

    public Median_und_Mittelwertberechnung(List<T> list){
        this.liste = list;
    }

    public double mittelwert(){
        double zahl = 0;
        for(int i=0 ; i <= liste.size() -1; i++){
            zahl= zahl + liste.get(i).doubleValue();
        }
        zahl = zahl/liste.size();
        return zahl;
    }

    public double med() {
        int n = liste.size();
        liste.sort(new Comparator<Number>() {

            @Override
            public int compare(Number o1, Number o2) {
                if (o1.doubleValue() == o2.doubleValue()) {
                    return 0;
                }
                if (o1.doubleValue() > o2.doubleValue()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        if (n % 2 != 0) {
            return liste.get(n / 2).doubleValue();
        } else {
            return 0.5 * (liste.get(n/2).doubleValue() + liste.get((n / 2) + 1).doubleValue());
        }

    }
}
