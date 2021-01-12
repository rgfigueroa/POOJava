/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author roberth
 */
public class Ejercicio2 {

    public static void main(String[] arg) {
        //String patron = "[a-z0-9]";
        String patron2 = "[a-zA-Z0-9]@[a-z].[a-zA-Z0-9]+]";
        Pattern p1 = Pattern.compile(patron2);
        //String texto1 = "Estamos aprendiendo expresiones regulares 2021 ambulancia";
        String texto1 = "roberth.figueroa@unl.edu.ec";

        Matcher m = p1.matcher(texto1);
        System.out.println(texto1);
        String resultado = m.replaceAll("x");
        System.out.println(resultado);
        if (resultado.equals("roberth.figueroa@unl.edu.ec")) {
            System.out.println("correo correcto");
        } else {
            System.out.println(" email incorreo ");

        }

    }

}
