public class principal {
    public static void main(String[] args) {
        Alumno pepe = new Alumno("pepe");
        Asignatura mates = new Asignatura("matemáticas", 3);

        pepe.matricular(mates);
        pepe.setNotas(mates, 1, 5.6f);
        pepe.setNotas(mates, 2, 6.0f);
        pepe.setNotas(mates, 3, 7.8f);

        pepe.aprobada(mates);

    }
}
