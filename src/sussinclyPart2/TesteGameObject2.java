package sussinclyPart2;

public class TesteGameObject2 {

	public static void main(String[] args) {
		
		GameObject someObject = new Player();
		GameObject someObject2 = new NPC();
		
		if (someObject instanceof GameObject) 
			System.out.println("O objeto é um GameObject!");
		else
			System.out.println("Não é um GameObject...");

		if (someObject instanceof Player)
			System.out.println("Objeto é um Player!");
		else
			System.out.println("Not a Player...");
		
		if (someObject instanceof NPC)
			System.out.println("O objeto é um NPC.");
		else
			System.out.println("Não é um NPC...");
		
		if (someObject2 instanceof NPC)
			System.out.println("O objeto é um NPC.");
		else
			System.out.println("Não é um NPC...");
	}
}