import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Asignatura {
    private String denominacion;
    private int numTrimestres;
    private Collection<Alumno> alumnos;
    private Map<Alumno, Map<Integer, Float>> notas;

    public Asignatura(String denominacion, int numTrimestres) {
        this.denominacion = denominacion;
        this.numTrimestres = numTrimestres;
        alumnos = new HashSet<>();
        notas = new HashMap<>();
    }

    public boolean anyadirAlumno(Alumno alumno) {
        return alumnos.add(alumno);
    }

    public void anyadirNota(Alumno alumno, int trimestre, float nota) {
        if (notas.size() >= numTrimestres) {
            throw new IllegalArgumentException("La asignatura ya tiene el número máximo de notas.");
        }
        notas.get(alumno).put(trimestre, nota);
    }

    public float media(Alumno alumno) {
        float media = 0.0f;
        for (int nota = 0; nota < notas.size(); nota++) {
            float n = notas.get(alumno).get(nota);
            media += n;
        };

        return media;
    }
}
