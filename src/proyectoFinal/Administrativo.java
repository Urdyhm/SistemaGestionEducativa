/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal;
/**
 *
 * @author sebastian.galvan
 */
public class Administrativo extends Persona implements Mostrable  {
    private long nro_emple_Ad;
    private char cargo;

    public long getNro_emple_Ad() {
        return nro_emple_Ad;
    }

    public void setNro_emple_Ad(long nro_emple_Ad) {
        this.nro_emple_Ad = nro_emple_Ad;
    }

    public char getCargo() {
        return cargo;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }

     public Administrativo(String nombre, int edad, char genero, long dni, long nro_emple_Ad, char cargo) {
        super(nombre, edad, genero, dni);
        this.nro_emple_Ad = nro_emple_Ad;
        this.cargo = cargo;
    }
    public void mostrar() {
        System.out.println("Datos del administrativo:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Genero: " + getGenero());
        System.out.println("DNI: " + getDni());
        System.out.println("Numero de empleado administrativo: " + getNro_emple_Ad());
        System.out.println("Cargo: " + getCargo());
    }
}
