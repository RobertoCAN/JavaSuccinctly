package trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaisUmTryCatch {
	public float numerador = 0.0f;
	public float denominador = 0.0f;

	public MaisUmTryCatch() {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Entre com um numerador: ");
			numerador = s.nextFloat();

			System.out.println("Entre com o denominador: ");
			denominador = s.nextFloat();

			System.out.println(numerador + " dividido por " + denominador + " é igual a " + (numerador / denominador));

		} catch (InputMismatchException e) {
			System.out.println("Sua entrada não é um float.");
		} catch (IllegalArgumentException e) {
			System.out.println("O resultado da divizão por zero é proibido!");
		} catch (Exception e) {
			System.out.println("Uma exeção foi lançada: " + e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
			System.out.println("Obrigado pelo seu tempo.");
		}
	}

}
