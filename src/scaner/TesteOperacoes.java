package scaner;

import java.util.Scanner;

public class TesteOperacoes {

	public static void main(String[] args) {
		Operacoes operacoes = new Operacoes();

		Scanner s = new Scanner(System.in);

		double parameterA = 0.0, parameterB = 0.0;

		int operation = 0;

		System.out.println("Welcome to Calculator");

		do {

			System.out.println("Type number: ");
			parameterA = Double.parseDouble(s.nextLine());
			System.out.println("Type other number: ");
			parameterB = Double.parseDouble(s.nextLine());
			System.out.println("Select an option: ");
			System.out.println("1. Add\n2. Subtract \n3. Multiply \n4. Divid\n0. Quit");
			
			operation = Integer.parseInt(s.nextLine());
			
			operacoes.calcula(operation, parameterA, parameterB);

		} while (operation == 0);
		System.out.println("Fim");
		if(s != null)
			s.close();
	}

}
