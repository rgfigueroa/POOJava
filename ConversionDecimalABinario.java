class ConversionDecimalABinario{
	public static void main(String[] arg){
		System.out.println("Ejercicio de Conversion de Decimal a Binario");
		int numero=16;
		int d= 2;
		int cosciente=0;
		int residuo=0;
		String respuesta = "";

		while(numero > 0)	{
			cosciente = numero/d;
			residuo = numero%d;
			numero=cosciente;
			//System.out.println(cosciente);
                        respuesta = respuesta+residuo;
			System.out.println(residuo);
		}
                System.out.println(respuesta);	
                for(int i=respuesta.length()-1; i>=0;i--){
                    System.out.println(respuesta.charAt(i));
                }			
	}
}
