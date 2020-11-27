/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package calculardecenasuperior;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class CalcularDecenaSuperior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define el tamaño del arreglo");
        int tamanio = scanner.nextInt();

        int arreglo[] = new int[tamanio];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el numero entero del arreglo");
            arreglo[i] = scanner.nextInt();
        }

        //     283
        //     3
        //     10-3=7
        // int arreglo[] = {1, 5, 7, 283, 540, 6, 9};
        // int arreglo[] = {10, 10, 10, 290, 540, 10, 10}; --> decena superior
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo [" + i + "]=" + arreglo[i]);
            int n = arreglo[i];
            int residuo = 0;
            residuo = n % 2;
            if (residuo == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
            int resto10 = n % 10;
            if (resto10 == 0) {
                resto10 = 10;
            }
            int loquefalta = 10 - resto10;
            int siguienteDecena = arreglo[i] + loquefalta;
            System.out.println("La siguiente decena de: " + arreglo[i] + " es " + siguienteDecena);
        }
    }
}
