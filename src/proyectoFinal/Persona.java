/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal;

/**
 *
 * @author sebastian.galvan
 */
public abstract class Persona {
    private String nombre;
    private int edad;
    private char genero;
    private long dni;
    
     public Persona(String nombre, int edad, char genero, long dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
      abstract void mostrar();
}
    
    interface Mostrable {
    void mostrar();
}

    

