/*
    Descripción: Programa que utiliza la recursividad para Factorial y Fibonacci
    Autor: Roberth
    Fecha: 11/11/2020
*/
public class Recursividad{
  	public static void main(String[] arg){
  		int f=1;
  		int n=7;
  	        int Resfac=0;
                  long respFibonacci=0;
           	for (int i=1;i<=n;i++) {
  			f=f*i;
  		}
  		System.out.println("El factorial de "+n+" es= "+f);
      //Metodo que utiliza la recursividad
      Resfac = factorial(n);
   	  System.out.println("El factorial es:"+Resfac);

      //Invoca al Metodo fibonacci
      respFibonacci=fib(n);
      System.out.println("El elemento de la serie en la posición "+n+" = "+respFibonacci);
  	}
    public static int factorial(int n){
        if(n==1){
           return 1;
        }
        else{
           return (n*factorial(n-1));
        }
    }
    public static long fib(int n) { 
        if (n < 2) {
         	 return n;
        } 
        else {
           return fib(n - 1) + fib(n - 2);
        }
    }
}
