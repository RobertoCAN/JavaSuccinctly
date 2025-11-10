package sussinclyPart2;

import java.util.Scanner;

public class TesteMenuComAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComAssert assert1 = new MenuComAssert();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== MENU =====");
		System.out.println("1 - Digitar um número inteiro");
        System.out.println("2 - Digitar um texto");
        System.out.print("Escolha a opção: ");
        
        int opcao = scanner.nextInt();
        
        assert1.menu_1(opcao);
	}

}
