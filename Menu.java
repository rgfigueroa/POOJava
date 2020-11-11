/*
  Programa que permite generar un menú dinámico
  Autor:Roberth Figueroa
  Fecha: 04/11/2020
*/
import java.util.Scanner;
class Menu{
   public static void main(String[] arg){
    Scanner entrada= new Scanner(System.in);
    System.out.println("***MENU***");
    
    int op=0;
    do{
    
       System.out.println("Presiona la Opcion Menu que desea:");
       System.out.println("1. Ir al programa Trapecio");
       System.out.println("2. Ver el ejercicio");
       System.out.println("3.Salir del programa");
       op = entrada.nextInt();
       switch(op){
         case 1: System.out.println("Ira al programa trapecio");
                  for(int i=0; i<=10; i++){
                    System.out.println("Buenos días!!"); 
                  }
                 break;
         case 2: System.out.println("Ira al ejericico DOS");
                 break;
         default: System.out.println("Solamente se permite ingresar opcion permita 1,2");      
 
       } 
    }while(op<3);   
  
  int A[] = new int[5];
  for(int i=0;i<5;i++){
       A[i]=i;
  }
  System.out.println("Presentar contenido");
  for(int i=0;i<5;i++){
     System.out.println(A[i]);
  }
 }
}
