package sussinclyPart2;

public class TesteGameObject {

	public static void main(String[] args) {
		GameObject[] gameObjects = new GameObject[5];

		gameObjects[0] = new Player();
		System.out.println(gameObjects[0]);

		for (int i = 1; i < gameObjects.length; ++i) {
			gameObjects[i] = new NPC();
			System.out.println(gameObjects[i]);
		}
		
//		System.out.println();
//
//		for (int i = 0; i < gameObjects.length; i++) {
//			gameObjects[i].teste();
//		}

		System.out.println();
//		gameObjects[0].x = 9;
//		gameObjects[0].y = 7;
		gameObjects[0].print();
		gameObjects[3].print();

		System.out.println();

		for (int i = 0; i < 5; i++) {
			gameObjects[i].print();
		}
	}

}
