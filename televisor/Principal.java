import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Soporte soporte = new Soporte(List.of("Batman.mp4", "Superman.mp4"));

        System.out.println(new Televisor().encender().bajarVolumen().volumen());
        System.out.println(new Televisor().subirVolumen().encender().subirVolumen().volumen());
        System.out.println(new Televisor().conectar(soporte).encender().reproducirSiConectado().equals(new ArrayList<String>(List.of("Batman.mp4", "Superman.mp4"))));

    }

}
