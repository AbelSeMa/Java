import java.util.ArrayList;
import java.util.List;

public class Televisor {
    private boolean estado;
    private int canal;
    private int volumen;
    private Soporte puerto;

    public Televisor() {
        estado = false;
        canal = 1;
        volumen = 0;
        puerto = null;
    }

    public Televisor encender() {
        estado = true;
        return this;
    }

    public Televisor apagadar() {
        estado = false;
        return this;
    }

    public Televisor subirVolumen() {
        if (estado && volumen < 30) {
            volumen += 1;
        }
        return this;
    }

    public Televisor bajarVolumen() {
        if (estado && volumen > 1) {
            volumen -= 1;
        }
        return this;
    }

    public int volumen() {
        return volumen;
    }

    public Televisor sintonizar(int canal) {
        if (estado == true) {
            if (canal >= 1 && canal <= 30) {
                this.canal = canal;
            }
        }

        return this;
    }

    public int canal() {
        return this.canal;
    }

    public Televisor conectar(Soporte usb) {
        puerto = usb;
        return this;

    }

    public Televisor desconectarSiConectado() {
        puerto = null;
        return this;
    }

    public List<String> reproducirSiConectado() {
        if (estado == true && puerto != null) {
            return new ArrayList<>(puerto.playlist());
        }

        return new ArrayList<>();
    }
}
