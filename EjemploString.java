/*
     Descripción: Tranajando con String
     Autor: Roberth
     Fecha:18/11/2020
*/

class EjemploString{
	public static void main(String[] cualquiercosa) {
        String str1 = "abc";
 
 	    char data[] = {'a', 'b', 'c'};

   	    String str = new String(data);

   	    String cadena="VivaLoja";

   	    String respuesta = cadena.substring(4);

   	    System.out.println(respuesta);
            
            char a = cadena.charAt(4);
            System.out.println(a);
            
            System.out.println("Trasnformando a Mayusculas: "+cadena.toUpperCase());
            cadena= cadena.toUpperCase();
            System.out.println("Impriendo un SubString: "+ cadena.substring(3,6));
	}

}
