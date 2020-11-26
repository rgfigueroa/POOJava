/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 * Descipción: Ejercicio que permite inciarse en el principio de Encapsulamiento
 *
 * @author roberth
 *
 */
public class EncapsulamientoDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        //Crear una persona

        PersonaDos personaAna = new PersonaDos("Ana");
        PersonaDos personaPablo = new PersonaDos("Pablo");
        PersonaDos personaMaria = new PersonaDos("Maria");
        PersonaDos personaLuis = new PersonaDos("Luis");
        PersonaDos personaJean = new PersonaDos("Jean");
        PersonaDos personaDiego = new PersonaDos("Diego");

        PersonaDos otroPersona = new PersonaDos();
        System.out.println("OtraPersona: Cedula: " + otroPersona.getCedula() + " Nacionalidad: " + otroPersona.getNacionalidad());

        personaAna.presentarDatosPersona(personaAna);
        personaPablo.presentarDatosPersona(personaPablo);
        personaMaria.presentarDatosPersona(personaMaria);
        personaLuis.presentarDatosPersona(personaLuis);
        personaJean.presentarDatosPersona(personaJean);
        personaDiego.presentarDatosPersona(personaDiego);

        personaAna.setNacionalidad("Argentina");
        System.out.println("Nombre:" + personaAna.getNombre());
        System.out.println("Cedula:" + personaAna.getCedula());
        System.out.println("Nacionalidad: " + personaAna.getNacionalidad());

    }
}

class PersonaDos {

    /**
     * Atributos privados de la clase Persona
     */
    private final String nombre;
    private String nacionalidad;
    private int cedula;
    private static int cedulaSiguiente = 1;

    /**
     * Método constructor de Persona
     *
     * @param nombre
     */
    PersonaDos(String nombre) {
        this.nombre = nombre;
        this.nacionalidad = "Ecuatoriana";
        this.cedula = this.cedulaSiguiente;
        this.cedulaSiguiente++;
    }

    public PersonaDos() {
        this.nombre = null;
    }

    public PersonaDos(String nombre, String nacionalidad, int cedula) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        //  System.out.println("Si me pides la cedula, te devuelvo el valor de la cedula " + this.cedula);
        return cedula;
    }

    /**
     * Metodo que permite configurar el nombre del objeto
     *
     * @param nombre
     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
    /**
     * Devuelve el nombre del objeto
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Metodo que configura o cambia la nacionalidad - Setter
     *
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Método que presente la información de Objeto Persona actual
     */
    static void presentarDatosPersona() {
        System.out.println("Es una metodo estatico");
        //System.out.println("La nacionalidad es:" + this.nacionalidad);
    }

    /**
     * Método que presenta la informacion de persona que recibe como parámetro.
     *
     * @param p Es el argumento Persona recibido
     */
    void presentarDatosPersona(PersonaDos persona) {
        System.out.println("Persona: " + persona.getNombre() + " tiene Nacionalidad " + persona.getNacionalidad()
                + " y su cedula es: " + persona.getCedula());
    }
}
