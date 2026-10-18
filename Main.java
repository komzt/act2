/**
 *Actividad 2 - Programa sencillo
 **/
public class Main {
    public static void main(String[] args) {
        // Instanciación: aquí creo los tres objetos (estudiantes)
        Estudiante estudiante1 = new Estudiante("Constantino Arenas", "A001", 92);
        Estudiante estudiante2 = new Estudiante("Gustavo Valdes", "A002", 65);
        Estudiante estudiante3 = new Estudiante("José García", "A003", 78);

        // Guardo las referencias para recorrer entre los objetos definidos anteriormente
        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");

        //Se recorre el arreglo anterior y llama a los métodos de cada objeto.
        for (Estudiante estudiante : estudiantes) {
            System.out.println("------------------------------");
            estudiante.mostrarDatos();
            System.out.println("Calificacion: " + estudiante.obtenerCalificacion());

            // El método estaAprobado() devuelve true o false, si el estudiante aprobó o no.
            if (estudiante.estaAprobado()) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: NO APROBADO");
            }
        }

        System.out.println("------------------------------");
    }
}