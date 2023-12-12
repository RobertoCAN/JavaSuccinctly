package br.part1;

public class Arrei {
	int number1, number2;
	
	float [][] array2d = new float[number1][number2];

	public Arrei() {
		for(int coluna = 0; coluna < number2; coluna++ ) {
			for(int linha = 0; linha < number1; linha++) {
				array2d[linha][coluna] = linha * coluna;
			}
		}
	}
	
	
	
}
