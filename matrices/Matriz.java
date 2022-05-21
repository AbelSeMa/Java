import java.util.ArrayList;
import java.util.List;

public class Matriz{
    private List<Integer> ele;

    public Matriz(List<Integer> secuencia) {
        ele = new ArrayList<>(secuencia);
    }

    public int tamanyo() {
        return (int) Math.sqrt(ele.size());
    }
}
