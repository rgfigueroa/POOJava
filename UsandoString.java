/*
	Descripcion: Manejo de String
	Autor: Roberth
	Fecha: 18/11/2020
*/

class UsandoString{
	public static void main(String[] args) {
		System.out.println("Trabajando con String y las posiciones");

		char data[] = {'a', 'b', 'c'};
                String str = new String(data);
                String cadena="VivaLoja";
                String subcadena="";

               char caracter = cadena.charAt(4);
               System.out.println(cadena);
	       System.out.println(caracter);	
	       subcadena = cadena.substring(4);
               System.out.println(subcadena);
               //Devuelve un substring
               System.out.println("Subcadena:");
               subcadena=cadena.substring(3,6);
               System.out.println(subcadena);
               //
               //Devuelve un substring
               System.out.println("Comparando cadenas:");
               int respuesta = cadena.compareTo(subcadena);
               System.out.println("La respueta es:"+respuesta);

               System.out.println("Comparando cadenas:");
               int respuestaDos = str.compareTo("abc");
               System.out.println("La respueta es:"+respuestaDos);     
	}
}
