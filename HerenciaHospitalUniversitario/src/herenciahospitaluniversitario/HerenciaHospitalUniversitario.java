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
public class HerenciaHospitalUniversitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sueldoNormal = 0.0;
        double sueldoExtra = 0.0;
        double salarioMensual = 0.0;

        Empleado empleado = new Empleado("Alex");
        Empleado empleado2 = new Empleado("Jean");

        empleado2.setSalario(100.00);

        empleado.setSalario(108.25);
        Empleado medico3 = new Medico(); //Medico --> Empleado del tipo Medico, es posible por Herencia
   
        System.out.println(medico3.getClass());
        Empleado medico4 = new Empleado();  //Empleado --> Empleado del tipo Empleado
        System.out.println(medico4.getClass());

        Medico medico2 = new Medico(); // Medico --> Medico del tipo Medico
        System.out.println(medico2.getClass());

        System.out.println(empleado2.getSalario());
        System.out.println(empleado.getSalario());

        Secretaria secre = new Secretaria();

        /*
        System.out.println(empleado.getNombre());
        Empleado medico = new Empleado("Dr. Juan Carillo", 8, 400);
        sueldoNormal = medico.calcularSueldo();
        sueldoExtra = medico.calcularSueldoExtra();
        medico.calcularSalarioMensual(sueldoNormal, sueldoExtra);

        Conductor conductor = new Conductor();
       
       
        
        medico2.setEspecialidad("Traumatólogo");
     //   medico3.setEspecialidad("Odontologo");

        System.out.println(medico2.getEspecialidad());
     //   System.out.println(medico3.getEspecialidad());
       
        medico3.calcularSueldo();
        
         */
    }

}
