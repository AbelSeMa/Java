package Piezas;

public class placaBase {
    private String modelo;
    private String chip;
    private int ram;
    private int grafica;

    public placaBase(String modelo, String chip, int ram, int grafica) {
        this.modelo = modelo;
        this.chip = chip;
        this.ram = ram;
        this.grafica = grafica;

    }

    public void ram() {
        System.out.println(this.ram);
    }

    public void grafica() {
        System.out.println(this.grafica);
    }
}
