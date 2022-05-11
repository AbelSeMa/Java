import llavespuertas.llave;
import llavespuertas.puerta;

public class principal {
    public static void main(String[] args) {
        llave l = new llave("roja");
        puerta p = new puerta("roja");

        System.out.println(l.Color());
        System.out.println(p.color());

        p.ponerLlave(l);
        p.quitarLlave();
        System.out.println(p.abrirPuerta());

    }
}
