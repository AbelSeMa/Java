import java.util.Collection;
import java.util.HashSet;

public class Alumno {
    private String nombre;
    private Collection<Asignatura> asignaturas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        asignaturas = new HashSet<>();
    }

    public Alumno matricular(Asignatura asignatura) {
        asignaturas.add(asignatura);
        asignatura.anyadirAlumno(this);
        return this;
    }

    public Alumno setNotas(Asignatura asignatura, int trimestre, float nota) {
        asignatura.anyadirNota(this, trimestre, nota);
        return this;
    }

    public float media(Asignatura asignatura) {
        return asignatura.media(this);
    }

    public float nota(Asignatura asignatura, int trimestre) {
        return asignatura.getNota(this, trimestre);
    }

    public boolean aprobada(Asignatura asignatura) {
        if (asignatura.media(this) < 5.0f) {
            return false;
        }
        return true;
    }
}
