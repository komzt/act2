public class Main {
    public static void main(String[] args) {
        // Creo un estudiante normal y dos estudiantes de las clases derivadas.
        Estudiante estudiante = new Estudiante("Constantino Arenas", "A001", 92);
        EstudianteBecado becado = new EstudianteBecado(
                "AlumnoBECA", "A002", 85, 30);
        EstudianteDeportista deportista = new EstudianteDeportista(
                "AlumnoDEPORTIVA", "A003", 78, "Natacion");

        System.out.println("=== ESTUDIANTE ===");
        estudiante.mostrarDatos();
        mostrarEstadoAcademico(estudiante);

        System.out.println("\n=== ESTUDIANTE BECADO ===");
        becado.mostrarDatos();
        mostrarEstadoAcademico(becado);
        System.out.println("Monto de la beca sobre una colegiatura de $5000: $"
                + becado.calcularMontoBeca(5000));

        System.out.println("\n=== ESTUDIANTE DEPORTISTA ===");
        deportista.mostrarDatos();
        mostrarEstadoAcademico(deportista);
        deportista.entrenar();
    }

    // Este método evita repetir la misma comprobación para cada estudiante.
    private static void mostrarEstadoAcademico(Estudiante estudiante) {
        System.out.println("Calificacion: " + estudiante.obtenerCalificacion());

        if (estudiante.estaAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: NO APROBADO");
        }
    }
}
