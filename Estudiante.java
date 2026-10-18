/**
 * Representa a un estudiante y guarda sus datos básicos que me sirven para este ejercicio
 */
public class Estudiante {
    // Atributos: datos que tendrá cada objeto Estudiante.
    private String nombre;
    private String matricula;
    private double calificacion;

    /**
     * Constructor: se ejecuta al crear un estudiante nuevo.
     * Recibe los datos iniciales y los guarda en los atributos.
     */
    public Estudiante(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;       // this.nombre es el atributo del objeto.
        this.matricula = matricula; // El parámetro aporta el valor inicial.
        this.calificacion = calificacion;
    }

    /** Muestra en pantalla el nombre y la matrícula del estudiante. */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
    }

    /** Devuelve la calificación guardada en el objeto. */
    public double obtenerCalificacion() {
        return calificacion;
    }

    /** Devuelve true si la calificación es de 70 o más; de lo contrario, false. */
    public boolean estaAprobado() {
        return calificacion >= 70;
    }
}
