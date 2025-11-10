package openDoor;

import java.util.Random;
import java.util.Scanner;

public class TesteOpenDoor {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int portaComCarro = r.nextInt(3)+1;
		int selecao;
		
		System.out.println("Existem três portas na sua frente\n"+
				"Atrás de duas portas, você irá encontrar uma cabra, mas \n"+
				"atrás da terceira porta, existe um carro novo como prêmio");
		
		System.out.println("Qual porta você escolhe:");
		selecao= scanner.nextInt();
		
		OpenDoor openDoor = new OpenDoor(selecao, portaComCarro);
	
		System.out.print(portaComCarro);
	}

}
