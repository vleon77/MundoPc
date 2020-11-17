package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int maxComputadoras = 5;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.maxComputadoras){
        this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("No es posible agregar mas computadoras a esta orden el máximo es: " + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden(){
        System.out.println("id de la Orden: " + this.idOrden);
        System.out.println("Lista de Computadoras:");
        for (int i = 0; i < this.contadorComputadoras ; i++) {
            System.out.println(computadoras[i].toString());
        }
    }

}
