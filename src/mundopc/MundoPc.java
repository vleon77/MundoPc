package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        orden1.mostrarOrden();

        Computadora computadora1= new Computadora("Pc Victor",new Monitor("Samsung",26),new Teclado("Teclado","Ducky"),new Raton("Ratón"," logitech"));
        Computadora computadora2= new Computadora("Laptop Yessi",new Monitor("Samsung",26),new Teclado("Teclado","Ducky"),new Raton("Ratón"," logitech"));
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);

        orden1.mostrarOrden();
    }
}
