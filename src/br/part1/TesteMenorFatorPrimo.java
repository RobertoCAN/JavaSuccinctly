package br.part1;

public class TesteMenorFatorPrimo {

	public static void main(String[] args) {
		int i = 2, count = 0, countePerLine = 10;

		System.out.println("Numeros primos de um a mil são: ");

		while (i <= 1000) {
			if (MenorFatorPrimo.EPrimo(i)) {

				System.out.print(i + ", ");
				count++;
				if (count % countePerLine == 0) {
					System.out.println();
				}
			}

			i++;
		}

	}

}
