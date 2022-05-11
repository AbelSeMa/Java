package Piezas;

public class cpu {
    String modelo;
    int nucleos;
    double Mhz;
    int cache;
    double consumo;

    public cpu(String modelo, int nucleos, double Mhz, int cache, double consumo) {
        this.modelo = modelo;
        this.Mhz = Mhz;
        this.cache = cache;
        this.nucleos = nucleos;
    }

    public void nucleos() {
        System.out.println(this.nucleos);
    }

    public void modelo() {
        System.out.println(this.modelo);
    }

    public void velocidadMhz() {
        System.out.println(this.Mhz);
    }

    public void cache() {
        System.out.println(this.cache);
    }


    public void consumo() {
        System.out.println(this.consumo);
    }

}
