/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoFinal;
import java.util.Scanner;
/**
 *
 * @author sebastian.galvan
 */
public class Main { 
    public static void main(String[] args) { 
  
        GestionInstitucion gestion = new GestionInstitucion();
        Scanner scanner = new Scanner(System.in);
        
        int opcion;

        do {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Agregar persona");
            System.out.println("2. Modificar persona");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Mostrar todas las personas");
            System.out.println("5. Mostrar estudiantes");
            System.out.println("6. Mostrar profesores");
            System.out.println("7. Mostrar administrativos");
            System.out.println("8. Mostrar un estudiante");
            System.out.println("9. Eliminar un estudiante");
            System.out.println("10. Modificar sueldo de profesores con antigüedad >= 12 años");
            System.out.println("11. Guardar datos en archivo");
            System.out.println("12. Mostrar datos del archivo");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarPersona(gestion, scanner);
                    break;
                case 2:
                    modificarPersona(gestion, scanner);
                    break;
                case 3:
                    eliminarPersona(gestion, scanner);
                    break;
                case 4:
                    gestion.mostrarPersonas();
                    break;
                case 5:
                    gestion.mostrarEstudiantes();
                    break;
                case 6:
                    gestion.mostrarProfesores();
                    break;
                case 7:
                    gestion.mostrarAdministrativos();
                    break;
                case 8:
                    mostrarUnEstudiante(gestion, scanner);
                    break;
                case 9:
                    eliminarUnEstudiante(gestion, scanner);
                    break;
                case 10:
                    int profesoresModificados = gestion.modificarSueldoProfesor(0.315);
                    System.out.println("Cantidad de profesores cuyo sueldo fue modificado: " + profesoresModificados);
                    break;
                case 11:
                    gestion.guardarDatos();
                    break;
                case 12:
                    gestion.mostrarDatos();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    break;
            }
            System.out.println("--------------------");
        } while (opcion != 0);
    }

    // Método para agregar una persona según la opcion elegida por el usuario
    private static void agregarPersona(GestionInstitucion gestion, Scanner scanner) {
        System.out.println("----- Agregar Persona -----");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Agregar Profesor");
        System.out.println("3. Agregar Administrativo");
        System.out.print("Ingrese la opcion deseada: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el género (M/F): ");
        char genero = scanner.next().charAt(0);
        System.out.print("Ingrese el DNI: ");
        long dni = scanner.nextLong();

        switch (opcion) {
            case 1:
            System.out.print("Ingrese el número de registro: ");
            long nro_reg = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Seleccione la modalidad dentro de estas opciones:");
            System.out.println("1. Pasteleria");
            System.out.println("2. Psicologia");
            System.out.println("3. Tecnologia e Informatica");
            System.out.println("4. Maestro Mayor de Obra");
            System.out.println("5. Otra");
            System.out.print("Ingrese el numero de la opcion deseada: ");
            int opcionModalidad = scanner.nextInt();
            String modalidad;
            switch (opcionModalidad) {
                case 1:
                    modalidad = "Pasteleria";
                    break;
                case 2:
                    modalidad = "Psicologia";
                    break;
                case 3:
                    modalidad = "Tecnologia e Informatica";
                    break;
                case 4:
                    modalidad = "Maestro Mayor de Obra";
                    break;
                case 5:
                    modalidad = "Otra";
                    break;
                default:
                    System.out.println("Opcion invalida. No se pudo agregar el estudiante.");
                    return;
                 }
                Estudiante estudiante = new Estudiante(nombre, edad, genero, dni, nro_reg, modalidad);
                gestion.agregarPersona(estudiante);
                System.out.println("Estudiante agregado con éxito.");
                break;
            case 2:
                System.out.print("Ingrese el número de empleado docente: ");
                long nro_empl_doc = scanner.nextLong();
                scanner.nextLine(); 
                System.out.println("Seleccione la especialidad dentro de estas opciones");
                System.out.println("1. Programacion");
                System.out.println("2. Base de Datos");
                System.out.println("3. Robotica");
                System.out.println("4. Electronica");
                System.out.print("Ingrese el numero de la opcion deseada: ");
                int especialidadOption = scanner.nextInt();
                String especialidad;
                switch (especialidadOption) {
                case 1:
                    especialidad = "Programacion";
                    break;
                case 2:
                    especialidad = "Base de Datos";
                    break;
                case 3:
                    especialidad = "Robotica";
                    break;
                case 4:
                    especialidad = "Electronica";
                    break;
                default:
                    System.out.println("Opcion invalida. No se pudo agregar el profesor.");
                    return;
                }
                System.out.print("Ingrese el salario: ");
                double salario = scanner.nextDouble();
                System.out.print("Ingrese la antigüedad: ");
                short antiguedad = scanner.nextShort();
                Profesor profesor = new Profesor(nombre, edad, genero, dni, nro_empl_doc, especialidad, salario, antiguedad);
                gestion.agregarPersona(profesor);
                System.out.println("Profesor agregado con éxito.");
                break;
            case 3:
                System.out.print("Ingrese el número de empleado administrativo: ");
                long nro_emple_Ad = scanner.nextLong();
                System.out.print("Ingrese el cargo (A/B/C/D): ");
                char cargo = scanner.next().charAt(0);
                Administrativo administrativo = new Administrativo(nombre, edad, genero, dni, nro_emple_Ad, cargo);
                gestion.agregarPersona(administrativo);
                System.out.println("Administrativo agregado con éxito.");
                break;
            default:
                System.out.println("Opcion invalida. No se pudo agregar la persona.");
                break;
        }
    }

    // Método para modificar una persona según el DNI ingresado por el usuario
    private static void modificarPersona(GestionInstitucion gestion, Scanner scanner) {
        System.out.println("----- Modificar Persona -----");
        System.out.print("Ingrese el DNI de la persona a modificar: ");
        long dni = scanner.nextLong();
        scanner.nextLine(); 

        if (gestion.existePersona(dni)){
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el género (M/F): ");
            char genero = scanner.next().charAt(0);
         if ((gestion.buscarPersona(dni)) instanceof Estudiante) {
            System.out.print("Ingrese el número de registro: ");
            long nro_reg = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Seleccione la modalidad dentro de estas opciones:");
            System.out.println("1. Pasteleria");
            System.out.println("2. Psicologia");
            System.out.println("3. Tecnologia e Informatica");
            System.out.println("4. Maestro Mayor de Obra");
            System.out.println("5. Otra");
            System.out.print("Ingrese el numero de la opcion deseada: ");
            int opcionModalidad = scanner.nextInt();
            String modalidad;
            switch (opcionModalidad) {
                case 1:
                    modalidad = "Pasteleria";
                    break;
                case 2:
                    modalidad = "Psicologia";
                    break;
                case 3:
                    modalidad = "Tecnologia e Informatica";
                    break;
                case 4:
                    modalidad = "Maestro Mayor de Obra";
                    break;
                case 5:
                    modalidad = "Otra";
                    break;
                default:
                    System.out.println("Opcion invalida. No se pudo agregar el estudiante.");
                    return;
                 }
            Estudiante estudianteMod = new Estudiante(nombre, edad, genero, dni, nro_reg, modalidad);
            gestion.modificarPersona(dni,estudianteMod);
            System.out.println("Estudiante agregado con éxito.");
            }else if (gestion.buscarPersona(dni) instanceof Profesor){
            System.out.print("Ingrese el número de empleado docente: ");
            long nro_empl_doc = scanner.nextLong();
            scanner.nextLine(); 
            System.out.println("Seleccione la especialidad dentro de estas opciones");
            System.out.println("1. Programacion");
            System.out.println("2. Base de Datos");
            System.out.println("3. Robotica");
            System.out.println("4. Electronica");
            System.out.print("Ingrese el numero de la opcion deseada: ");
                int especialidadOption = scanner.nextInt();
                String especialidad;
                switch (especialidadOption) {
                case 1:
                    especialidad = "Programacion";
                    break;
                case 2:
                    especialidad = "Base de Datos";
                    break;
                case 3:
                    especialidad = "Robotica";
                    break;
                case 4:
                    especialidad = "Electronica";
                    break;
                default:
                    System.out.println("Opcion invalida. No se pudo agregar el profesor.");
                    return;
                }
            System.out.print("Ingrese el salario: ");
            double salario = scanner.nextDouble();
            System.out.print("Ingrese la antigüedad: ");
            short antiguedad = scanner.nextShort();
            Profesor profesorMod = new Profesor(nombre, edad, genero, dni, nro_empl_doc, especialidad, salario, antiguedad);
            gestion.modificarPersona(dni,profesorMod);
            System.out.println("Profesor modificado con éxito.");
            }else{
            System.out.print("Ingrese el número de empleado administrativo: ");
            long nro_emple_Ad = scanner.nextLong();
            System.out.print("Ingrese el cargo (A/B/C/D): ");
            char cargo = scanner.next().charAt(0);
            Administrativo administrativoMod = new Administrativo(nombre, edad, genero, dni, nro_emple_Ad, cargo);
            gestion.modificarPersona(dni,administrativoMod);
            System.out.println("Administrativo modificado con éxito.");
        }
         }else{
            System.out.println("No se encontro ninguna persona con el DNI especificado.");
        }
    }
        
    
    // Método para eliminar una persona según el DNI ingresado por el usuario
    private static void eliminarPersona(GestionInstitucion gestion, Scanner scanner) {
        System.out.println("----- Eliminar Persona -----");
        System.out.print("Ingrese el DNI de la persona a eliminar: ");
        long dni = scanner.nextLong();
        gestion.eliminarPersona(dni);
    }

    // Método para mostrar los datos de un estudiante según el DNI ingresado por el usuario
    private static void mostrarUnEstudiante(GestionInstitucion gestion, Scanner scanner) {
        System.out.println("----- Mostrar Un Estudiante -----");
        System.out.print("Ingrese el DNI del estudiante a mostrar: ");
        long dni = scanner.nextLong();
        gestion.mostrarUnEstudiante(dni);
    }

    // Método para eliminar un estudiante según el DNI ingresado por el usuario
    private static void eliminarUnEstudiante(GestionInstitucion gestion, Scanner scanner) {
        System.out.println("----- Eliminar Un Estudiante -----");
        System.out.print("Ingrese el DNI del estudiante a eliminar: ");
        long dni = scanner.nextLong();
        gestion.eliminarUnEstudiante(dni);
        
    }
}