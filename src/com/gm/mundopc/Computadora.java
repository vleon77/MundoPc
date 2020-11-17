package com.gm.mundopc;

public class Computadora {
     private final int idComputadora;
     private String nombre;
     private Monitor monitor;
     private Teclado teclado;
     private Raton raton;
     private static int contadorCompuatdora;

     private Computadora(){
         this.idComputadora = ++Computadora.contadorCompuatdora;
     }

     public Computadora(String nombre,Monitor monitor, Teclado teclado, Raton raton){
         this();
         this.nombre = nombre;
         this.monitor = monitor;
         this.teclado = teclado;
         this.raton = raton;
     }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorCompuatdora() {
        return Computadora.contadorCompuatdora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }
}

