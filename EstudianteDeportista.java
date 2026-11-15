// Esta clase conserva los datos de Estudiante de la act. 2 y agrega información deportiva.
public class EstudianteDeportista extends Estudiante {
    private String disciplinaDeportiva;

    public EstudianteDeportista(String nombre, String matricula,
                                double calificacion, String disciplinaDeportiva) {
        super(nombre, matricula, calificacion);
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    // Se sobrescribe el metodo para incluir la disciplina del estudiante.
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disciplina deportiva: " + disciplinaDeportiva);
    }

    // Este metodo es propio de los estudiantes deportistas.
    public void entrenar() {
        System.out.println("El estudiante esta entrenando: " + disciplinaDeportiva);
    }
}
