/*
   Descripcion: Suma de una matriz
   Autor:Roberth
   Fecha:24/11/2020
*/
import java.util.Scanner;

class SumarMatriz{
	public static void main(String[] args) {
		System.out.println("Trabajando con matrices");
		//Aqui colocar su lógica
		Scanner scanner = new Scanner(System.in);
		int suma=0;
		System.out.println("Ingresar tamanio matriz nxn:");
		int n = scanner.nextInt();
		int matriz[][]= new int[n][n];

        // For para leer el contenido por teclado
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				System.out.println("Ingresa el elemento ["+i+"]["+j+"]: ");	
				matriz[i][j]= scanner.nextInt();		
			}
		}

		//For para mostrar el contenido
	    System.out.println("La matriz es:");
	    
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				System.out.print(matriz[i][j]+"\t");
				suma=suma+matriz[i][j];
			}
			System.out.println();
		}
		System.out.println("La Suma Total de la matriz es: "+suma);
	}
}

