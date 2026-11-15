// Un estudiante becado también es un estudiante, por eso hereda de Estudiante.
public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    // super() manda los datos generales al constructor de la clase Estudiante.
    public EstudianteBecado(String nombre, String matricula,
                            double calificacion, double porcentajeBeca) {
        super(nombre, matricula, calificacion);
        this.porcentajeBeca = porcentajeBeca;
    }

    // Se agrega el porcentaje de beca a los datos que ya muestra la clase base.
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beca: " + porcentajeBeca + "%");
    }

    // Calcula cuánto representa la beca sobre el costo indicado.
    public double calcularMontoBeca(double costoColegiatura) {
        return costoColegiatura * porcentajeBeca / 100;
    }
}
