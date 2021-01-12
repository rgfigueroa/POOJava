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
public class RegExpMatches {

    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobaaaaabbunlabgo"; 
    private static String REPLACE = "-";

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);

        // get a matcher object
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

}
