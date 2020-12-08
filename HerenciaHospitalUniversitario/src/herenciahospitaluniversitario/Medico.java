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
public class Medico extends Empleado {

    private String especialidad;

    public Medico() {
    }
    

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void operar() {
    }

    public void recetarMedicinas() {
    }
}
