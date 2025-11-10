package sussinclyPart2;

import java.util.Scanner;

public class MenuComAssert {

	Scanner scanner = new Scanner(System.in);

	public Integer escolha1;
	public String escolha2;

	public void menu_1(int valor) {
		if (valor == 1) {
			System.out.println("Digite um numero inteiro: ");
			escolha1 = scanner.nextInt();

			assert escolha1 instanceof Integer : "Erro: valor deveria ser Integer, mas não é!";

			System.out.println("Valor recebido com sucesso! " + this.escolha1);

		} else if (valor == 2) {
			System.out.println("Digite uma String: ");
			escolha2 = scanner.next();

			assert escolha2 instanceof String : "Erro: valor deveria ser String, mas não é!";

			System.out.println("Valor recebido com sucesso! " + this.escolha2);

		} else {
			System.out.println("opção invalida!");
			return;
		}

		scanner.close();
	}
}
