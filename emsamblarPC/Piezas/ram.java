package Piezas;

public class ram {
    String modelo;
    long capacidad;
    double consumo;

    public ram(String modelo, long capacidad, double consumo) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void capacidad() {
        System.out.println(this.capacidad);
    }

    public void modelo() {
        System.out.println(this.modelo);
    }

    public void consumo() {
        System.out.println(this.consumo);
    }
}
