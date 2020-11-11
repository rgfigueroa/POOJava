/*
   Ejercicio Orientado a Objetos
   Autor: Roberth Figueroa
   Fecha: 04/11/2020
*/

class Trapecio{
   //atributos
    double baseMayor=5.5;
    int baseMenor=3;
    double altura=2.2;
    double lado= 1.5;
    String color="Azul";

    //metodos
    void CalcularArea(){
      System.out.println("El area es:"+ (baseMayor+baseMenor*altura/2));
    }
    void CalcularPerimetro(){
     double perimetro= (baseMayor+baseMenor)+2*lado;
     System.out.println("El perimetro es:"+ perimetro);
    }
}
public class Ejemplo{
   public static void main(String[] arg){
     System.out.println("Ejecución principal");
     Trapecio miobjeto = new Trapecio();
     miobjeto.CalcularArea();    //accediendo al metodo CalcularArea
     miobjeto.CalcularPerimetro();
     System.out.println("El color es:"+ miobjeto.color); 
   }
}
