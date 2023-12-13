package br.part1;

public class Arrei {
	int number1, number2;

	public Arrei(int num2, int num1) {
		this.number1 = num1;
		this.number2 = num2;
	}

	protected void Entrega() {

		float[][] array2d = new float[number1][number2];
		for (int coluna = 0; coluna < number2; coluna++) {
			System.out.println();
			for (int linha = 0; linha < number1; linha++) {
				array2d[linha][coluna] = linha * coluna;
				System.out.print(array2d[linha][coluna] + " | ");
			}
		}
	}

}
