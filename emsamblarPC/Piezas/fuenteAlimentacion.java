package Piezas;

public class fuenteAlimentacion {
    String modelo;
    double poder;


    public fuenteAlimentacion(String modelo, double poder) {
        this.modelo = modelo;
        this.poder = poder;
    }

    public void modelo() {
        System.out.println(this.modelo);
    }

    public void poder() {
        System.out.println(this.poder);
    }
}
