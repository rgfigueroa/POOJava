/*
	Ejemplo: Trabajando con Matrices
	Autor: Roberth
	Fecha: 01-06-2020
	Actualización: 03-06-2020.
	Se adapata el código Mostrar la suma total de las comisiones de todos los autos.
*/

import java.util.Scanner;

public class MatrizAutos{
	public static void main(String[] args) {
		System.out.println("Trabajando con una matriz Objetos:Autos");
		
		Scanner s= new Scanner(System.in);
		int suma = 0;
		double sumdiagonal=0.0;
		double comisionTotal=0.0;
		String colorAuto="";

 		System.out.println("Ingresa el tamano de Fila y Columna");

		int n = s.nextInt();
        auto [][] matriz = new auto[n][n]; 
        
        //Cargar la información a la matriz
		for (int i=0;i< n ; i++) {
			for (int j=0;j< n ; j++) {
				//Asigno a cada posición[i][] el valor n
				System.out.println("Ingresa el color del auto: ");
				colorAuto=s.next();
				auto objAuto = new auto();
				System.out.println("Ingresa precio para auto ["+i+"]["+j+"]:");
				objAuto.precio=s.nextDouble();
				System.out.println("Ingresa marca auto ["+i+"]["+j+"]:");
				objAuto.marca=s.next();
				objAuto.color=colorAuto;
				matriz[i][j] = objAuto;
			}	
		}
        //Mostrar el contenido de la matriz
		for (int i=0;i< n ; i++) {
			for (int j=0;j< n ; j++) {
				System.out.print(" "+matriz[i][j].marca+" "+matriz[i][j].color+"  "+matriz[i][j].precio+"  ");
                matriz[i][j].calcularComisionVenta(matriz[i][j].precio);
                if (i==j)
				{
					sumdiagonal = sumdiagonal + matriz[i][j].precio;
				}
			}
			System.out.println();
		}
		System.out.println("La suma de la diagonal principal: "+sumdiagonal);
	}
}
class auto{
    double precio;
	String marca;
	String color;

	auto(){
		this.color="blanco";  // Variable
		this.precio=5000;     //Variable inicializada Constructor
		this.precio = this.precio + (this.precio * 0.25);  //Agrego un costo adicional del 10% al precio ingresado.
		System.out.println("Color:"+this.color+ "    Precio:"+this.precio);
	}

	auto(String color){
		this.color= color;
	}
	public static void calcularComisionVenta(double precio){
		System.out.print(" Comision del auto: " + (precio * 0.1)+" ");
	}
	public void mostrarInformacionAuto(){
		System.out.println("Precio auto: "+this.precio);
		System.out.println("Marca auto: "+this.marca);
		System.out.println("Color auto: "+this.color);
	}
}
