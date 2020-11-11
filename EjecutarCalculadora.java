/*
    Descripcion: Aplicando el concepto de POO a una calculadora básica
    Autor: Roberth
    Fecha:11/11/2020
*/

class Calculadora{
	//Atributos
	int numeroUno= 5;
	int numeroDos= 2;
	int resultado= 0;

    Calculadora(){

    }

	//Metodos
    public void sumar(int n1, int n2){
    	resultado=n1+n2;
    	System.out.println("El resultado de la Suma es:"+ resultado);
    }
    public void restar(int min, int sus){
    	resultado=min+sus;
    	System.out.println("El resultado de la Resta es:"+ resultado);
    }
}

public class EjecutarCalculadora{
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.sumar(5,4);
	}
}