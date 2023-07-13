/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal;
/**
 *
 * @author sebastian.galvan
 */
public class Profesor extends Persona implements Mostrable {
    private long nro_empl_doc;
    private String especialidad;
    private double salario;
    private short antiguedad;

    

    public Profesor(String nombre, int edad, char genero, long dni, long nro_empl_doc, String especialidad, double salario, short antiguedad) {
        super(nombre, edad, genero, dni);
        this.nro_empl_doc = nro_empl_doc;
        this.especialidad = especialidad;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public short getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(short antiguedad) {
        this.antiguedad = antiguedad;
    }

    public long getNro_empl_doc() {
        return nro_empl_doc;
    }

    public void setNro_empl_doc(long nro_empl_doc) {
        this.nro_empl_doc = nro_empl_doc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void mostrar() {
        System.out.println("Datos del profesor:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Genero: " + getGenero());
        System.out.println("DNI: " + getDni());
        System.out.println("Numero de empleado docente: " + getNro_empl_doc());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Antigüedad: " + getAntiguedad() + " años");
    }
}
