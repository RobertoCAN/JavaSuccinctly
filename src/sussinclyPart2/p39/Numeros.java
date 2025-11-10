package sussinclyPart2.p39;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Numeros {

	Set<Integer> numerosUnicos = new HashSet<Integer>();

	Random random = new Random();

	double x;

	public Numeros(double x) {
		this.x = x;
		System.out.printf("%.0f \n", this.x);
	}

	public void pegandoValorArray(int entrada) {

		while (numerosUnicos.size() < entrada) {
			
			int i = 0;
			int numeroAleatorio = random.nextInt(25);
			numerosUnicos.add(numeroAleatorio + 1);
			if(numeroAleatorio == 14 ) System.out.println(numerosUnicos);
		}

		Integer[] arrayFinal = new Integer[entrada];
		int iniciando = 0;

		for (Integer numero : numerosUnicos) {
			arrayFinal[iniciando++] = numero;
		}
		System.out.println("Impressão do array: ");

		for (Integer i : arrayFinal) {
			System.out.print(i + " ");
		}
	}

}
