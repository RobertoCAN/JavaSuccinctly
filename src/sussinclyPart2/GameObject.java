package sussinclyPart2;

public abstract class GameObject {
	//member variables
	int x = 2, y = 3;

	public GameObject() {
		x = y = -1;
		}
	
	//none abstract method
	public void print() {
		System.out.println("Position: " + x + ", " + y);
	}
	
	public abstract void move();
	public abstract String teste();
}
