package com.company;

public abstract class Menu {
    protected double precioBase = 5.0;

    //template method
    public void prepararMenu() {
        armado();
        calcularPrecioVenta();
    };

    public abstract void armado();
    public abstract double calcularPrecioVenta();
}