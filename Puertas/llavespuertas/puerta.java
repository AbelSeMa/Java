package llavespuertas;
public class puerta {

    private String color;
    private llave llave = null;
    private boolean estado = false;

    public puerta (String color) {
        this.color = color;
    }

    public String color() {
        return this.color;
    }

    public puerta ponerLlave(llave l) {
        this.llave = l;
        this.estado = true;
        return this;
    }

    public llave quitarLlave() {
        llave l = this.llave;
        this.llave = null;
        return l;
    }

    public boolean abrirPuerta() {
        if (this.llave == null) {
            return false;
        }
        if (estado != false) {
            return false;        }
        if (this.color != llave.Color()) {
            return false;
        }

        estado = true;
        return estado;
    }

    public boolean abierta() {
        return this.estado;
    }

    public void cerrar() {
        this.estado = false;
    }
}
