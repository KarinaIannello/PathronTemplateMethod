package com.company;

public class MenuClasico extends Menu {

    @Override
    public void armado() {
        System.out.println("El costo final del menu es de: " + calcularPrecioVenta());
    }

    @Override
    public double calcularPrecioVenta() {
        return this.precioBase;
    }
}
