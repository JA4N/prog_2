package JUnit;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTest {

    //Muss static sein, da methodenübergreifend
    private static Maximum max;
    private int result;

    //Als aller erstes soll die Methode ausgeführt werden
    @BeforeAll
    public static void setUp(){
        max = new Maximum();
    }

    // Wird das Maximum unabhängig von der Argumentreihenfolge korrekt gefunden?
    @Test
    public void testDifferent() {
        result = max.findMaximum(1, 2, 3);
        assertEquals(result, 3);
        result = max.findMaximum(3, 2, 1);
        assertEquals(result, 3);
        result = max.findMaximum(2, 3, 1);
        assertEquals(result, 3);
    }

    // Funktioniert der Test mit drei verschiedenen Argumenten auch mit negativen Zahlen?
    @Test
    public void testNegDifferent() {
        result = max.findMaximum(-1, -2, -3);
        assertEquals(result, -1);
        result = max.findMaximum(-3, -2, -1);
        assertEquals(result, -1);
        result = max.findMaximum(-2, -1, -3);
        assertEquals(result, -1);
    }

    // Was ist, wenn zwei der drei Zahlen gleich sind?
    @Test
    public void testTheSame() {
        result = max.findMaximum(1, 1, 3);
        assertEquals(result, 3);
        result = max.findMaximum(3, 2, 3);
        assertEquals(result, 3);
        result = max.findMaximum(0, 1, 1);
        assertEquals(result, 1);
    }

    // Zwei von drei negativen Zahlen sind gleich
    @Test
    public void testNegTheSame() {
        result = max.findMaximum(-1, -2, -1);
        assertEquals(result, -1);
        result = max.findMaximum(-3, -3, -1);
        assertEquals(result, -1);
        result = max.findMaximum(-2, -2, -3);
        assertEquals(result, -2);
    }

    // Was ist, wenn alle drei Zahlen gleich sind?
    @Test
    public void testAllTheSame() {
        result = max.findMaximum(1, 1, 1);
        assertEquals(result, 1);
    }

    // Drei gleiche negative Zahlen
    @Test
    public void testNegAllTheSame() {
        result = max.findMaximum(-1, -1, -1);
        assertEquals(result, -1);
    }

}
