# SistemaGestionEducativa
PRÁCTICO INTEGRADOR PARA CERTIFICACIÓN 1° TRAMO ARGENTINA PROGRAMA UNSL - Java 20 SDK en Apache NetBeans

Enunciado
Se requiere desarrollar un sistema de gestión para una Institución Educativa. Cada Estudiante, Profesor y Administrativo 
tienen estados y comportamientos específicos donde se necesita implementar funcionalidades como agregar, 
modificar, eliminar, mostrar, entre otros datos.
Se requiere utilizar la colección ArrayList para almacenar los Estudiantes, Profesores y Administrativos. 
En este práctico se incluye: herencia, polimorfismo, interface, colecciones, archivos en java, excepciones, entre otros 
conceptos vistos a lo largo de este curso.
1. Crear una clase llamada Persona (abstracta). Los datos y operaciones que se necesitan son:
- String nombre
- int edad 
- char género
- long dni // opcional 
- getters y setters correspondientes
- Constructor/es
- Un método abstracto llamado mostrar () o interfaz mostrable.
- Otros datos u operaciones que considere necesarios
2. Crear una clase llamada Estudiante que herede de la clase Persona. Los datos y operaciones que se necesitan son:
- long nro_reg //Identificador único para cada estudiante
- String modalidad /* Modalidad puede ser:
 1-Pasteleria
 2-Psicología 
 3-Tecnología e Informática 
 4-Maestro Mayor de Obra
 5-Otra */
- getters y setters correspondientes.
- Constructor/es
- Implementar mostrar ()// Muestra todos los datos de estudiante
- Otros datos u operaciones que considere necesarios
3. Crear una clase llamada Profesor que herede de la clase Persona e implemente la interfaz Mostrable. Los datos y 
operaciones que se necesitan son:
- long nro_empl_doc //Identificador único para cada empleado
- String especialidad //Programación, Base de Datos, Robótica, Electrónica
- double salario
- short antiguedad
- getters y setters correspondientes
- Constructor/es
- Implementar mostrar // Muestra todos los datos de profesor
- Otros datos u operaciones que considere necesarios
UNSL DESARROLLADOR JAVA NORMA PEREZ
[2] 
4. Crear una clase llamada Administrativo que herede de la clase Persona. Los datos y operaciones que se necesitan 
son:
- long nro_emple_Ad //Identificador único para cada administrativo
- char cargo //Categoría del cargo A, B, C, D. Siendo la D la más baja
- getters y setters correspondientes
- Constructor/es
- Implementar mostrar // Muestra todos los datos de administrativo
- Otros datos u operaciones que considere necesarios
5. Crearuna claseGestionInstitucionque contenga un ArrayList para almacenar objetos de tipo Persona. Debe incluir 
las siguientes operaciones:
1) agregarPersona(...): permite agregar un objeto de tipo Persona en el ArrayList.
2) modificarPersona(...): permite modificar todos los datos de una Persona existente (por ejemplo, según DNI)
en el ArrayList.
3) eliminarPersona(...): permite eliminar una Persona (por ejemplo, según DNI) en el caso de existir. De no 
existir informar a través de un mensaje al usuario.
4) mostrarPersonas(...): muestra todos los datos de todas las Personas almacenadas.
5) mostrarEstudiantes(...): muestra todos los datos de los Estudiantes almacenados.
6) mostrarProfesores(...): muestra todos los datos de los Profesoresalmacenados.
7) mostrarAdministrativos(...): muestra todos los datos de los Administrativos almacenados.
8) mostrarUnEstudiante(...): muestra todos los datos del estudiante pasado por parámetro (por ejemplo,según 
el DNI). De no existir informar a través de un mensaje al usuario. 
9) eliminarUnEstudiante(...): eliminar un estudiante (por ejemplo, segúnDNI) pasado por parámetro e informar si 
la operación pudo realizarse con éxito o no. 
10) modificarSueldoProfesor(...): modificar sueldo de todos los profesores cuya antigüedad sea mayor e igual a 12 
años. El nuevo sueldo es establecido por el sueldo actual + 31.5%. Debe devolver la cantidad de profesores 
cuyo sueldo fue modificado e informado por salida estándar.
11) guardarDatos(): guarda los datos de la institución en un archivo denominado backupInstitucion.txt. El 
guardado debe realizarse bajo los siguientes criterios: 
 Estudiante: aquellos cuya modalidad seleccionada sea “Tecnología e Informática”.
 Profesor: aquellos cuya especialidad sea “Programador”.
 Administrador: los que tengan categoría ‘A’ y ‘D’ solamente.
12) mostrarDatos(): mostrar los datos almacenados en el archivo backupInstitucion.txt considerando que debe ser 
visible su formato para el usuario.
13) Implementar el menú principal en la clase Main. El menú debe permitir al usuario seleccionar las operaciones 
mencionadas anteriormente.
Nota 1: Si el programador lo desea puede tener una clase Menú.
Nota 2: Utilizar excepciones para manejar posibles errores al trabajar con archivos.
Nota 3: El DNI no se repite. 
Nota 4: Recuerde de utilizarinstanceof cuando sea necesario. 
Consideraciones para entregar práctico:
 El proyecto debe ser subido al aula comprimido para ser ejecutado en NetBeans.
 El programa debe compilar
 Debe presentar como ejercicios obligatorios 1 al 5, 9, 11 y el 13.
