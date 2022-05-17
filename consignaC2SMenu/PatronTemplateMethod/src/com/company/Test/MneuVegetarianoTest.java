package com.company.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.MenuVegetariano;
import com.company.Menu;
public class MneuVegetarianoTest {
    @Test
    public void calcularPrecioVenta_comprobarQueElValorTotalSeaCorrecto(){
        //GIVEN - Dado
        Menu menu = new MenuVegetariano(true, 2);
        double resultadoEsperado = 9.05;
        //WHEN - Cuando
        double resultado = menu.calcularPrecioVenta();
        //THEN - Entonces
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
