package com.company;

public class MenuVegetariano extends Menu {
    private boolean especias;
    private int cantidadSalsas;

    //constructor
    public MenuVegetariano(boolean especias, int cantidadSalsas) {
        this.especias = especias;
        this.cantidadSalsas = cantidadSalsas;
    }

    @Override
    public void armado() {
        if (this.especias){
            System.out.println("El menu va con especias.");
        }
        if (this.cantidadSalsas > 0){
            System.out.println("El menu debe llevar " + this.cantidadSalsas + " salsas.");
        }
        System.out.println("El costo final del menu es de: " + calcularPrecioVenta());
    }


    @Override
    public double calcularPrecioVenta() {
        double subtotal = 0.0;
        if (this.especias){
            subtotal = this.precioBase * 1.01;
        }
        return subtotal + this.cantidadSalsas * 2.0;
    }
}
