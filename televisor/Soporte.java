import java.util.ArrayList;
import java.util.List;

public class Soporte {
    private List<String> lista;

    public Soporte(List<String> playlist) {
        lista = new ArrayList<>(playlist);
    }

    public List<String> playlist() {
        return lista;
    }

    public String reproducir(int indice) {
       if (indice > lista.size()) {
           throw new ArrayIndexOutOfBoundsException("El soporte no tiene tantos elementos.");
       }
       return lista.get(indice - 1);
    }
}
