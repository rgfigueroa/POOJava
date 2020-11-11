/*
    Descripcion: Uso de mi primera clase
    Autor: Roberth
    Fecha:10/11/2020
*/
class Auto{
   //Atributos
   int anioFabricacion;
   String marca="Kia";
   String placa;
   boolean estado=false;
   //Constructor
   Auto(){
   }
   Auto(boolean Nuevoestado){
       //Verificar la creacion del objeto
       System.out.println("El argumento es:"+Nuevoestado);
       this.estado=Nuevoestado;
   }
   //Metodos
   public boolean RealizarCarrera(){
       System.out.println("Realizando una carrera, el auto esta ocupado");
       estado = true;
       return estado;
   } 
   public void arrancar(){
      System.out.println("Puede arrancar esta en condiciones perfectas");
   }
}
public class EjecutarAuto{
   public static void main( String [] arg ){
        Auto taxi= new Auto();
        Auto miauto= new Auto();
        taxi.arrancar();
        System.out.println("La marca del auto es: "+ taxi.marca);
        System.out.println("Estado del auto es: "+ taxi.estado);
        boolean respuesta =  taxi.RealizarCarrera();
        System.out.println("El estado ha cambiado y ahora tiene el valor: "+ taxi.estado);
        System.out.println("imprimiendo respuesta= "+respuesta);
        System.out.println("Estado del Objeto mi auto  es: "+ miauto.estado);
        //Utilizando el otro constructor
        Auto ford= new Auto(true);
        System.out.println("El ESTADO del FORD es: "+ford.estado);
   }
}
