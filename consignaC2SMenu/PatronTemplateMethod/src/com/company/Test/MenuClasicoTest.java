package com.company.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.Menu;
import com.company.MenuClasico;

public class MenuClasicoTest {
    @Test
    public void calcularPrecioVenta_comprobarQueElValorTotalSeaCorrecto(){
        //GIVEN - Dado
        Menu menu = new MenuClasico();
        double resultadoEsperado = 5.0;
        //WHEN - Cuando
        double resultado = menu.calcularPrecioVenta();
        //THEN - Entonces
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
