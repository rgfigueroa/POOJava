/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionregular;

/**
 *
 * @author roberth
 */
public class ValidarCedula {

    public static void main(String[] arg) {
        System.out.println("Dato a verificar: 1101374521 --> " + validarCedula("1101374521"));
    //    System.out.println("Dato a verificar: 19k13a4521 --> " + validarCedula("19k13a4521"));

        System.out.println("Verificar un nombre: Juan --> " + validarNombreApellido("Juan Martinez"));
//        System.out.println("Verificar un nombre: Juan Perez --> " + validarNombreApellido("Juan Perez"));
//        System.out.println("Verificar un nombre: Juanito Perez Perez --> " + validarNombreApellido("Juanito Perez Perez"));
//
//        System.out.println("Validar un número entero: 183234235 --> " + validarEntero(Integer.toString(183234235)));
//        System.out.println("Validar un número entero: -183234235 --> " + validarEntero(Integer.toString(-183234235)));
//
//        System.out.println("Validar un número entero: -186 --> " + validarEntero(Integer.toString(-186)));
//        System.out.println("Validar un número entero: 1187 --> " + validarEntero(Integer.toString(187)));
    }

    public static boolean validarCedula(String cedula) {
        return cedula.matches("^[0-9a-z]{10}$");
    }

    public static boolean validarNombreApellido(String nombre) {
        return nombre.matches("^([A-Z]{1}[a-z]*[ ]?){1,2}$");
    }

    public static boolean validarEntero(String numero) {
        // return numero.matches("^-?[0-9]+$");
        return numero.matches("^-?[1-9]+[0-9]+$");
    }
}
