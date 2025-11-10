package br.part1;

public class MenorFatorPrimo {

	private static int pegueMenorFator(int numero) {

		int sqrt = (int) Math.sqrt(numero);

		if (numero % 2 == 0) {
			return 2;
		}

		for (int i = 3; i <= sqrt; i += 2) {
			if (numero % i == 0) {
				return i;
			}
		}

		return numero;
	}

	public static Boolean EPrimo(int x) {
		return pegueMenorFator(x) == x;
	}
}
