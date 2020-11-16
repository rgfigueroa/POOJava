/*
    Descripción: Trabajando con Matriz de objetos Autos
    Autor: rgfigueroa
    Fecha: 16/11/2020
*/
import java.util.Scanner;

class auto{
	String marca;
	String color;
	double precio;
    
    auto(){

    }
    auto(String color){
    	this.color=color;
    }
    public void calcularCostoMatriculacion(double costoAuto){
       System.out.println("Precio de matriculacion: "+ (costoAuto*0.1));
    }
    public void mostrarInformacionAuto(){
    	System.out.println("La marca del auto es:"+this.marca);
    	System.out.println("El precio del auto es:"+this.precio);
    	System.out.println("El color del auto es:"+this.color);
    }
}

public class PracticaMatrizObjetos{
	public static void main(String[] arg){
		System.out.println("Trabajando con una matriz Objetos:Autos");

		Scanner scanner= new Scanner(System.in);
 		System.out.println("Ingresa el tamano de Fila y Columna");

		int n = scanner.nextInt();
        auto [][] matriz = new auto[n][n]; 

        
        for (int i=0;i<n ;i++ ) {
        	for (int j=0;j<n ;j++ ) {
                System.out.println("Ingresa Auto posicion:["+i+"]["+j+"]:");
        		System.out.print("Ingresa el color del auto:");
        		auto objetoAuto = new auto();
        		objetoAuto.color=scanner.next();

        		System.out.print("Ingresa el precio del auto: ");
        		objetoAuto.precio=scanner.nextDouble();

        		System.out.print("Ingresa la marca del auto: ");
        		objetoAuto.marca=scanner.next();
        		matriz[i][j]=objetoAuto;
        	}
        }
        System.out.println("Matriz de Autos:");

        for (int i=0;i<n ;i++ ) {
        	for (int j=0;j<n ;j++ ) {

        		System.out.print("Auto["+i+"]["+j+"]"+matriz[i][j].color+"\t"+matriz[i][j].marca+"\t");        		
        	}
        	System.out.println();
        }
	}
}