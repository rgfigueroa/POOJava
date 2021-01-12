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
public class ExpresionRegular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String  patron= "a[mp]"; // -->  am , ap
        Pattern p1= Pattern.compile(patron);
        String texto1="Estamos aprendiendo expresiones regulares, ambulancia";
        Matcher m=p1.matcher(texto1);
        System.out.println(texto1);
        String resultado=m.replaceAll("x");
        System.out.println(resultado);
        
    }
    
}
