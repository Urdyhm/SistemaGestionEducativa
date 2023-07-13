/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author sebastian.galvan
 */
public class GestionInstitucion {

    private ArrayList<Persona> personas;
    
    public GestionInstitucion(){
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }
    
    public boolean existePersona(long dni){
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                return true;
            }
        }
        return false;
    }
    
    public Persona buscarPersona(long dni) {
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
            return persona;
        }
    }
      System.out.println("No se encontró ninguna persona con el DNI especificado.");
      return null;
    }
    public void modificarPersona(long dni, Persona nuevaPersona) {
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getDni() == dni) {
                personas.set(i, nuevaPersona);
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con el DNI especificado.");
    }

    public void eliminarPersona(long dni) {
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getDni() == dni) {
                personas.remove(i);
                System.out.println("Persona eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con el DNI especificado.");
    }

    public void mostrarPersonas() {
        System.out.println("Personas registradas:");
        for (Persona persona : personas) {
            persona.mostrar();
            System.out.println("----------------");
        }
    }
 
    public void mostrarEstudiantes() { 
        System.out.println("Estudiantes registrados:");
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                persona.mostrar();
                System.out.println("----------------"); //Separador de lineas
            }
        } 
    } 
 
    public void mostrarProfesores() { 
        System.out.println("Profesores registrados:"); 
        for (Persona persona : personas) { 
            if (persona instanceof Profesor) { 
                persona.mostrar(); 
                System.out.println("----------------"); //Separador de lineas
            } 
        } 
    } 
 
    public void mostrarAdministrativos() { 
        System.out.println("Administrativos registrados:"); 
        for (Persona persona : personas) { 
            if (persona instanceof Administrativo) { 
                persona.mostrar(); 
                System.out.println("----------------"); //Separador de lineas
            } 
        } 
    } 
 
    public void mostrarUnEstudiante(long dni) { 
        for (Persona persona : personas) { 
            if (persona instanceof Estudiante && persona.getDni() == dni) { 
                persona.mostrar(); 
                return; 
            } 
        } 
        System.out.println("No se encontro ningun estudiante con el DNI especificado."); 
    } 
 
    public void eliminarUnEstudiante(long dni) { 
        for (int i = 0; i < personas.size(); i++) { 
            Persona persona = personas.get(i); 
            if (persona instanceof Estudiante && persona.getDni() == dni) { 
                personas.remove(i); 
                System.out.println("Estudiante eliminado correctamente."); 
                return; 
            } 
        } 
        System.out.println("No se encontro ningun estudiante con el DNI especificado."); 
    } 
 
    public int modificarSueldoProfesor(double nuevoPorcentaje) { 
          int count = 0; //Mantenemos el registro de la cantidad
        for (Persona persona : personas) {
            if (persona instanceof Profesor && ((Profesor) persona).getAntiguedad() >= 12) {
                double nuevoSueldo = ((Profesor) persona).getSalario() * (1 + nuevoPorcentaje);
                ((Profesor) persona).setSalario(nuevoSueldo);
                count++;
            }
        } 
        return count; 
    } 
 
    public void guardarDatos() { 
        try { 
            FileWriter fileWriter = new FileWriter("backupInstitucion.txt"); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
 
           for (Persona persona : personas) {
                if (persona instanceof Estudiante && ((Estudiante) persona).getModalidad().equals("Tecnologia e Informatica")) {
                    bufferedWriter.write("Estudiante \n");
                    bufferedWriter.write("Nombre: " +persona.getNombre() + ", Edad: " + persona.getEdad() + ", Genero: " + persona.getGenero() + ", DNI: " + persona.getDni()
                            + ", Numero de registro: " + ((Estudiante) persona).getNro_reg() + ", Modalidad: " + ((Estudiante) persona).getModalidad() + "\n");
                } else if (persona instanceof Profesor && ((Profesor) persona).getEspecialidad().equals("Programacion")) {
                    bufferedWriter.write("Profesor \n");
                    bufferedWriter.write("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() + ", Genero: " + persona.getGenero() + ", DNI: " + persona.getDni()
                            + ", Numero de empleado docente " + ((Profesor) persona).getNro_empl_doc() + ", Especialidad: " + ((Profesor) persona).getEspecialidad()
                            + ", " + ((Profesor) persona).getSalario() + ", Antigüedad: " + ((Profesor) persona).getAntiguedad() + "\n");
                } else if (persona instanceof Administrativo && (((Administrativo) persona).getCargo() == 'A' || ((Administrativo) persona).getCargo() == 'D')) {
                    bufferedWriter.write("Administrativo \n");
                    bufferedWriter.write("Nombre: " +persona.getNombre() + ", Edad: " + persona.getEdad() + ", Genero: " + persona.getGenero() + ", DNI: " + persona.getDni()
                            + ", Numero de empleado administrativo: " + ((Administrativo) persona).getNro_emple_Ad() + ", Cargo: " + ((Administrativo) persona).getCargo() + "\n");
                }
            } 
 
            bufferedWriter.close(); 
            System.out.println("Los datos se han guardado en el archivo backupInstitucion.txt"); 
        } catch (IOException e) { 
            System.out.println("Error al guardar los datos en el archivo."); 
            e.printStackTrace(); 
        } 
    } 
 
    public void mostrarDatos() { 
        try { 
            FileReader fileReader = new FileReader("backupInstitucion.txt"); 
            BufferedReader bufferedReader = new BufferedReader(fileReader); 
 
            String line; 
            while ((line = bufferedReader.readLine()) != null) { 
                System.out.println(line); 
            } 
 
            bufferedReader.close(); 
        } catch (FileNotFoundException e) { 
            System.out.println("El archivo backupInstitucion.txt no fue encontrado."); 
            e.printStackTrace(); 
        } catch (IOException e) { 
            System.out.println("Error al leer el archivo."); 
            e.printStackTrace(); 
        } 
    } 
} 
 

