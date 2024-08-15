package taller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    @Test
    public void testFindMaxNumerosPositivos() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
    }

    @Test
    public void testFindMaxNumerosNegativos() {
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
    }

    @Test
    public void testFindMaxMixedNumbers() {
        assertEquals(5, Calculation.findMax(new int[]{-1, 3, -2, 5, 0}));
    }

    @Test
    public void testFindMaxElementoSingular() {
        assertEquals(7, Calculation.findMax(new int[]{7}));
    }
    
    @Test
    public void testFindMaxArregloVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculation.findMax(new int[]{});
        });
    }
    
    
    /*1.Verifica el comportamiento con un arreglo de números positivos.
    2.Verifica el comportamiento con un arreglo de números negativos.
    3.Verifica el comportamiento con un arreglo de números mixtos (positivos y negativos).
    4. Verifica el comportamiento cuando el arreglo tiene un solo elemento.
   5. Verifica que el método lanza una excepción cuando el arreglo está vacío.*/
}
