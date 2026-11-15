// Esta clase guarda los datos que tienen en común todos los estudiantes.
public class Estudiante {
    private String nombre;
    private String matricula;
    private double calificacion;

    // El constructor recibe los datos básicos para registrar al estudiante.
    public Estudiante(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public boolean estaAprobado() {
        return calificacion >= 70;
    }
}
