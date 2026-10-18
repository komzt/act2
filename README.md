Registro de estudiantes en Java

Aplicación de consola muy sencilla para practicar programación orientada a objetos. El programa crea tres estudiantes, muestra sus datos, consulta sus calificaciones y determina si aprobaron.

Objetivo

Practicar estos conceptos:

* Clase: Estudiante, que sirve como molde para crear estudiantes.
* Atributos: nombre, matricula y calificacion.
* Constructor: Estudiante(...), que inicializa los atributos de cada objeto.
* Instanciación: creación de objetos con new Estudiante(...).
* Métodos: mostrarDatos(), obtenerCalificacion() y estaAprobado().
* Programa principal: Main, donde se crean y utilizan los objetos.

La calificación mínima para aprobar en este ejemplo es 70.

Archivos del proyecto

registro-estudiantes/
Estudiante.java  # Define la clase y sus métodos
Main.java        # Crea los objetos y ejecuta el programa
README.md        # Explica el proyecto

Requisitos

* JDK (Java Development Kit) instalado.
* Un editor o IDE IntelliJ IDEA
El proyecto no necesita bases de datos ni bibliotecas externas.

Ejemplo de salida

 === REGISTRO DE ESTUDIANTES ===

Nombre: Chstantino Arenas
Matricula: A001
Calificacion: 92.0
Estado: APROBADO

Nombre: Gustavo Valdez
Matricula: A002
Calificacion: 65.0
Estado: NO APROBADO

Nombre: José García
Matricula: A003
Calificacion: 78.0
Estado: APROBADO

¿Cómo agregar otro estudiante?

En Main.java, crea otro objeto con el constructor y agrégalo al arreglo estudiantes. Por ejemplo:

Estudiante estudiante4 = new Estudiante("Carlos Ruiz", "A004", 85);
Estudiante[] estudiantes = {
estudiante1, estudiante2, estudiante3, estudiante4
};