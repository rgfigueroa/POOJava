/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package encapsulamiento;

/**
 * Descipción: Ejercicio que permite inciarse en el principio de Encapsulamiento
 * @author roberth
 * 
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        //Crear una persona
        Persona pAna = new Persona("Ana");
        //System.out.println("Ana es de:" + pAna.nacionalidad);
        System.out.println("Ana es de:" + pAna.getNacionalidad());
        pAna.presentarDatosPersona();
        pAna.setNacionalidad("Argentina");
        pAna.presentarDatosPersona(pAna);
    }
}

class Persona {
    /**
     * Atributos privados de la clase Persona
     */
    private String nombre;
    private String nacionalidad;
    
    /**
     * Método constructor de Persona
     * @param nombre 
     */
    Persona(String nombre) {
        this.nombre = nombre;
        this.nacionalidad = "Ecuatoriana";
    }
    /**
     * Metodo que retorna la nacionalidad - Getter
     * @return 
     */
    public String getNacionalidad(){
        return nacionalidad;   
    }
    /**
     * Metodo que configura o cambia la nacionalidad - Setter
     * @param nacionalidad 
     */
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    /**
     * Método que presente la información de Objeto Persona actual
     */
    void presentarDatosPersona() {
        System.out.println("El nombre es:" + this.nombre);
        System.out.println("La nacionalidad es:" + this.nacionalidad);
    }
    /**
     * Método que presenta la informacion de persona que recibe como parámetro.     * 
     * @param p Es el argumento Persona recibido
     */
    void presentarDatosPersona(Persona p) {
        System.out.println("Usando el metodo donde se envio por parametro el Objeto p que es una Persona");
        System.out.println("El nombre es:" + p.nombre);
        System.out.println("La nacionalidad es:" + p.nacionalidad);
    }
}
