package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;


    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
