/*
   Descripción:Programa que Ordena información del Arreglo o vector tanto Ascendente como Descendentemente aplicando Burbuja.
   Fecha: 06/11/2020
   Autor: Roberth
*/

import java.util.Scanner;

class Arreglo{
     public static void main(String[] var){
        int aux=0;
        int DP=0,DS=0,Res=0;
        int arreglo[] = new int [10];
        int Matriz[][] = new int[4][4];
        Scanner entrada= new Scanner(System.in);
        System.out.println("***Programa para ordenar un Arreglo***");
        System.out.println("Ingresar los datos del  Arreglo");
        for(int i=0;i<arreglo.length;i++){
           arreglo[i]=entrada.nextInt();
        }
        for(int i=0;i<arreglo.length;i++){
           System.out.println("arreglo["+i+"] = "+arreglo[i]);
        
        }
        //logica del metodo burbuja
        for(int i=0;i<arreglo.length;i++){
           for(int j=0;j<arreglo.length-1;j++){
              if(arreglo[j]<arreglo[j+1]){
                  aux= arreglo[j];
                  arreglo[j]= arreglo[j+1];
                  arreglo[j+1]=aux;
              }
           }
        }
        System.out.println("ORDEN DESCENDENTE"); 
        for(int i=0;i<arreglo.length;i++){
            System.out.println("arreglo["+i+"] = "+arreglo[i]);
        }
       //Orden Ascendente
        for(int i=0;i<arreglo.length;i++){
           for(int j=0;j<arreglo.length-1;j++){
              if(arreglo[j]>arreglo[j+1]){
                  aux= arreglo[j];
                  arreglo[j]= arreglo[j+1];
                  arreglo[j+1]=aux;
              }
           }
        }
        System.out.println("ORDEN ASCENDENTE");
        for(int i=0;i<arreglo.length;i++){
            System.out.println("arreglo["+i+"] = "+arreglo[i]);
        }
       //Cargar y presentar la matriz M
       for (int i=0;i<Matriz.length;i++){
          for(int j=0;j<Matriz.length;j++){
             Matriz[i][j]=entrada.nextInt();
          }
       }
       //Presentar la matriz 
       for (int i=0;i<Matriz.length;i++){
          for(int j=0;j<Matriz.length;j++){
            // System.out.print("Matriz ["+i+"]["+j+"] = "+Matriz[i][j]);
            System.out.print(Matriz[i][j]+"\t");
          }
          System.out.println();
       }
       //Operacion con matriz Res=DP-DS
       for (int i=0;i<Matriz.length;i++){
          for(int j=0;j<Matriz.length;j++){
             //diagonal principal
             if(i==j){
                  DP=DP+Matriz[i][j];
             }
             //Diagonal secundaria
             if(i+j==Matriz.length-1){
                DS=DS+Matriz[i][j];
                System.out.println("Numero: "+Matriz[i][j]);
             }
          }
          System.out.println();
       }
       System.out.println("La sumatoria de DP= "+DP);
       System.out.println("La sumatoria de DS= "+DS);
     }
}
