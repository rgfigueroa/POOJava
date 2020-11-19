/*
    Descripción:
    Autor: Roberth
    Creado: 01/06/2020
    Modificado: 13/11/2020
 */

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class OrdenarMatriz {

    /**
     * @param args the command line arguments Metodo prinicipal
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar tananio: ");
        int aux = 0;
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingresa el valor matriz " + '[' + i + ']' + '[' + j + ']' + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz ingresada:");
        verMatriz(n, matriz);

        int valor = 0;
        valor = verElementoMatriz(1, 1, matriz);
        System.out.println("Valor ahora:" + valor);

        System.out.println("Ordenar matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if (matriz[i][j] < matriz[k][l]) {
                            System.out.println("E [i,j]:" + matriz[i][j]);
                            System.out.println("E [k,l]:" + matriz[k][l]);
                            System.out.println("indice de j:" + j);
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = aux;
                        }
                    }
                }
            }
            System.out.println("indice:" + i);
        }  

        System.out.println("Matriz Ordenada Ascendentemente:");
        verMatriz(n, matriz);

    }

    public void cargarDatos() {
    }

    /**
     * Este metodo sirve para mostrar el contenido de la matriz que se envia
     * como argumento
     *
     * @param matriz es la matriz [][]
     * @param n es el tamanio de la matriz
     * @return No retorna nada
     */
    public static void verMatriz(int n, int matriz[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Este metodo sirve para mostrar el contenido de un solo elemento de la
     * matriz dado el i y j como argumento
     *
     * @param matriz es la matriz [][]
     * @param i es fila
     * @param j la columna
     * @return el elemento de la matriz
     */
    public static int verElementoMatriz(int i, int j, int matriz[][]) {
        //linea para mostrar un valor al programador.
        System.out.println("Envias el valor:" + matriz[i][j]);
        return matriz[i][j];
    }
}
