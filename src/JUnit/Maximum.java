package JUnit;

public class Maximum {

    public int findMaximum (int num1, int num2, int num3){
        int maxzahl = 0;

        if(num1 >= num2 && num1 >= num3){
            maxzahl = num1;
        }else if (num2 >= num1 && num2 >= num3){
            maxzahl = num2;
        }else maxzahl = num3;

        return maxzahl;
    }
}
