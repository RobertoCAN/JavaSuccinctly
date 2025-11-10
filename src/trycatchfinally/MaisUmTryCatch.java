package trycatchfinally;

import java.util.Scanner;

public class MaisUmTryCatch {
	public float numerador = 0.0f;
	public float denominador  = 0.0f;
	
	public MaisUmTryCatch() {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um numerador: ");
		numerador = s.nextFloat();
		
		System.out.println("Entre com o denominador: ");
		denominador = s.nextFloat();
				
			System.out.println(numerador + " dividido por " + denominador + " é igual a " + (numerador / denominador));
		
	}
	
	
	
}
