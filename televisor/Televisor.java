import java.util.ArrayList;
import java.util.List;

public class Televisor {
    private boolean estado;
    private int canal;
    private int volumen;
    private Soporte usb;

    public Televisor() {
        estado = false;
        canal = 1;
        volumen = 0;
        usb = null;
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
        this.usb = usb;
        return this;

    }

    public Televisor desconectarSiConectado() {
        usb = null;
        return this;
    }

    public List<String> reproducirSiConectado() {
        if (estado == true && usb != null) {
            return new ArrayList<>(usb.playlist());
        }

        return new ArrayList<>();
    }
}
