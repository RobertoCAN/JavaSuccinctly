package openDoor;

public class OpenDoor {

	public int selecaoPorta = 0;

	public OpenDoor(int selecaoPorta, int portaComCarro) {
		if (selecaoPorta < 1 || selecaoPorta > 3) {
			System.out.println("As portas são 1, 2 ou 3...");
			selecaoPorta = 0;
		} else if (selecaoPorta == portaComCarro){
			System.out.println("Sim, você ganhou o carro!!!");
		}else {
			System.out.println("Não, isto é uma cabra... ");
			selecaoPorta = 0;
		}

	}
}
