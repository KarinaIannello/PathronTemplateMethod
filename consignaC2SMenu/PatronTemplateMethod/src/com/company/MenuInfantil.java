package com.company;

public class MenuInfantil extends Menu {
    private int cantidadJuguetes;

    //constructor
    public MenuInfantil(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public void armado() {
        System.out.println("El menu debe llevar " + this.cantidadJuguetes + " juguetes.");
        System.out.println("El costo final del menu es de: " + calcularPrecioVenta());
    }

    @Override
    public double calcularPrecioVenta() {
        return this.precioBase + (this.cantidadJuguetes * 3.0);
    }
}
