/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionregular;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author roberth
 */
public class RegularExp {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String args[]) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // consigue una coincidencia
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Numero de la coincidencia " + count);
            System.out.println("inicio(): " + m.start());
            System.out.println("fin(): " + m.end());
        }
    }
}
