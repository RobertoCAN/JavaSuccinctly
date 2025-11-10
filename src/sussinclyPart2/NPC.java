package sussinclyPart2;

public class NPC extends GameObject {

	@Override
	public void move() {
		System.out.println("The shopkeeper wanders around aimlessly...");
	}
	
	@Override
	public String teste() {
    //System.out.println("Testeando outro método abstrato.");
		return "Testeando outro método abstrato.!!!";
	}
	
	@Override
	public String toString() {
		return teste();
	}
}
