/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciahospitaluniversitario;

/**
 *
 * @author roberth
 */
public class Empleado {

    private String nombre;
    private int horario;
    private double salario;

    Empleado() {
    }

    Empleado(String nombre) {
        this.nombre = nombre;
    }

    Empleado(String nombre, int horario) {
        this.nombre = nombre;
        this.horario = horario;
    }

    public Empleado(String nombre, int horario, double salario) {
        this.nombre = nombre;
        this.horario = horario;
        this.salario = salario;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodos set y get para campo Nombre
    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHorario(int numHoras) {
        this.horario = numHoras;
    }

    public int getHorario() {
        return horario;
    }

    public double calcularSueldo() {
        System.out.println("Su sueldo es: " + this.salario);
        return this.salario;
    }

    public double calcularSueldoExtra() {
        System.out.println("Su sueldo extra es: " + (((2 * this.horario) * 4) + this.salario));
        return (((2 * this.horario) * 4) + this.salario);
    }

    public void calcularSalarioMensual(double sn, double sExtra) {
        double sueldo = sn + sExtra;
        System.out.println("Su Salario Mensual es: " + sueldo);

    }

}
