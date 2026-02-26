package br.part1;

public class PontoFlutuante {

	public static void main(String[] args) {
		float j = 901.0f / 13.0f;
		float q = (53.0f / 13.0f) * 17.0f;

		System.out.println("J: " + j + " Q: " + q);

		if (j != q)
			System.out.println("As duas não são iguais!");
		
		if (Math.abs(j-q)> 0.001f) {
			System.out.println("Os dois números não são iguais!");
		}else {
			float x = q-j;
			System.out.println(" " + x + " "+ ( Math.abs(j-q)> 0.001f));
		}
	}

}
