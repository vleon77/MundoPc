package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private final int  idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
