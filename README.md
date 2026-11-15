# Registro de estudiantes - Actividad 3: Herencia

Esta actividad amplía el proyecto de la Actividad 2. Se conserva la clase `Estudiante` y se agregan dos clases que heredan de ella: `EstudianteBecado` y `EstudianteDeportista`.

## ¿Qué hace el programa?

Crea tres objetos: un estudiante, un estudiante becado y un estudiante deportista. Muestra sus datos, consulta sus calificaciones y determina si aprobaron. También calcula el monto de una beca y muestra una acción propia del estudiante deportista.

## Conceptos que se practican

- **Clase base:** `Estudiante` contiene los datos y métodos que comparten los estudiantes.
- **Herencia:** `EstudianteBecado` y `EstudianteDeportista` usan `extends Estudiante` para heredar de la clase base.
- **Reutilización:** las clases derivadas usan el constructor de la clase base mediante `super(...)` y aprovechan métodos como `obtenerCalificacion()` y `estaAprobado()`.
- **Sobrescritura:** las dos clases derivadas redefinen `mostrarDatos()` con `@Override`. Al llamar `super.mostrarDatos()` conservan la información general y agregan sus propios datos.
- **Métodos propios:** `calcularMontoBeca()` pertenece a `EstudianteBecado` y `entrenar()` pertenece a `EstudianteDeportista`.
