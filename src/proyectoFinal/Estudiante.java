/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal;

/**
 *
 * @author sebastian.galvan
 */
public class Estudiante extends Persona implements Mostrable {
    long nro_reg;
    String modalidad;

    public long getNro_reg() {
        return nro_reg;
    }

    public void setNro_reg(long nro_reg) {
        this.nro_reg = nro_reg;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

       public Estudiante(String nombre, int edad, char genero, long dni, long nro_reg, String modalidad) {
        super(nombre, edad, genero, dni);
        this.nro_reg = nro_reg;
        this.modalidad = modalidad;
    }
       
    
    @Override
    public void mostrar() {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Genero: " + getGenero());
        System.out.println("DNI: " + getDni());
        System.out.println("Numero de registro: " + getNro_reg());
        System.out.println("Modalidad: " + getModalidad());
    }

}
