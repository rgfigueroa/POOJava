/*
   Descripcion: Trabajando con matrices y objetos
   Autor: Roberth
   Fecha:24/11/2020   
*/

import java.util.Scanner;

public class MatrizPersonas{
	public static void main(String[] args) {
		System.out.println("Ingrese el tamaño de la matriz:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int auxEdad=0;
		String auxNombre="";
		Persona matriz[][] = new Persona[n][n];

		for (int i=0;i<n ;i++) {
			for (int j=0;j<n ;j++ ) {
				System.out.println("Ingresa la Persona ["+i+"]["+j+"]:");
				Persona objetoPersona = new Persona();
				System.out.println("Ingresa el Nombre:");
				objetoPersona.nombre = scanner.next();
				System.out.println("Ingresa el Edad:");
				objetoPersona.edad=scanner.nextInt();
				matriz[i][j]=objetoPersona;
			}	
		}
		System.out.println("Matriz Ingresa:\n");

		for (int i=0;i<n ;i++) {
			for (int j=0;j<n ;j++ ) {
				System.out.print("\t"+matriz[i][j].nombre+"|"+matriz[i][j].edad+"\t");				
			}
			System.out.println();
		}

		//Ordenar Ascendentemente por Edad. -->int
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if (matriz[i][j].edad < matriz[k][l].edad) {
                            auxEdad = matriz[i][j].edad;
                            auxNombre=matriz[i][j].nombre;
                            matriz[i][j].edad = matriz[k][l].edad;
                            matriz[i][j].nombre = matriz[k][l].nombre;
                            matriz[k][l].edad = auxEdad;
                            matriz[k][l].nombre = auxNombre;
                        }
                    }
                }
            }
        }  
        
		System.out.println("Ordenado Ascendentemente por Edad:\n");

		for (int i=0;i<n ;i++) {
			for (int j=0;j<n ;j++ ) {
				System.out.print("\t"+matriz[i][j].nombre+"|"+matriz[i][j].edad+"\t");	
				//matriz[i][j].mostrarDatosPersona();			
			}
			System.out.println();
		}

		//Ordenar Ascendentemente por Nombre -->String

		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                          //Permite ver la respuesta entera del método compareToIgnoreCase()
                          int respuesCampareToIgnoreCase = matriz[i][j].nombre.compareToIgnoreCase(matriz[k][l].nombre);
                          System.out.println("respuesCampareToIgnoreCase:"+ respuesCampareToIgnoreCase);

                        if ((matriz[i][j].nombre.compareToIgnoreCase(matriz[k][l].nombre)<0)) {

                            auxEdad = matriz[i][j].edad;
                            auxNombre=matriz[i][j].nombre;
                            matriz[i][j].edad = matriz[k][l].edad;
                            matriz[i][j].nombre = matriz[k][l].nombre;
                            matriz[k][l].edad = auxEdad;
                            matriz[k][l].nombre = auxNombre;
                        }
                    }
                }
            }
        }

        System.out.println("Ordenado Ascendentemente por Nombre:\n");

		for (int i=0;i<n ;i++) {
			for (int j=0;j<n ;j++ ) {
				System.out.print("\t"+matriz[i][j].nombre+"|"+matriz[i][j].edad+"\t");	
				//matriz[i][j].mostrarDatosPersona();			
			}
			System.out.println();
		}  
	}
}

class Persona{
	String nombre;
	int edad;
    
    public void mostrarDatosPersona(){
    	System.out.println("Persona:");
    	System.out.print("Nombre: "+this.nombre+"|");
    	System.out.println("Edad:"+this.edad);
    }
    public void cambiarNombrePersona(String nombre){
         this.nombre=nombre;
    }
    public void ordenarAscendente(){
         //Logica de ordenamiento ascendente
    }
    public void ordenarDescendente(){
         //Logica de ordenamiento descendente
    }
}