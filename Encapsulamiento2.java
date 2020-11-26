/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento2;

/**
 *
 * @author roberth
 */
public class Encapsulamiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona personaMaria = new Persona("Maria");
        Persona personaPedro = new Persona("Pedro");
        Persona personaJuan = new Persona("Juan");
        Persona personaAngel = new Persona("Angel");
        Persona personaBrigith = new Persona("Brigith");
        Persona personaAnibal = new Persona("Anibal");

        personaMaria.mostrarDatosPersona(personaMaria);
        personaPedro.mostrarDatosPersona(personaPedro);
        personaJuan.mostrarDatosPersona(personaJuan);
        personaAngel.mostrarDatosPersona(personaAngel);
        personaBrigith.mostrarDatosPersona(personaBrigith);
        personaAnibal.mostrarDatosPersona(personaAnibal);
         
         //Persona.mostrarDatosPersona(personaMaria); --> LLamada directamente a un metodo static
         //Persona.mostrarDatosPersona(personaPedro);
         
        
    }
}

class Persona {

    private final String nombre;
    private String nacionalidad;
    private int cedula;
    private static int cedulaSiguiente = 1;
   
    //Metodos de acceso a los atributos getters y setters
    public String getNombre() {
        return this.nombre;
    }


    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.nacionalidad = "Ecuatoriana";
        this.cedula =this.cedula+ this.cedulaSiguiente;
        this.cedulaSiguiente++;
    }

    Persona(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarDatosPersona() {
        System.out.println("Persona: " + this.nombre + " su nacionalidad es: " + this.nacionalidad);
    }

    /**
     * Metodo sobrecargado que presenta los datos del Objeto Persona enviado como argumento
     * @param p es el argumento Persona
     */
    public void mostrarDatosPersona(Persona p) {
        System.out.println("Persona: " + p.nombre + " su nacionalidad es: " + 
                               p.nacionalidad+" y su cedula es:"+p.cedula);
    }

}
