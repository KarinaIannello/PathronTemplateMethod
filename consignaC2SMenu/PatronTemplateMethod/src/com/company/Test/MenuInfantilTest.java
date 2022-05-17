package com.company.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.MenuInfantil;
import com.company.Menu;

public class MenuInfantilTest {
    @Test
    public void calcularPrecioVenta_comprobarQueElValorTotalSeaCorrecto() {
        //GIVEN - Dado
        Menu menu = new MenuInfantil(2);
        double resultadoEsperado = 11.0;
        //WHEN - Cuando
        double resultado = menu.calcularPrecioVenta();
        //THEN - Entonces
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
