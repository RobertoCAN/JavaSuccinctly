package sussinclyPart2.p43;

public class TesteAnonymousP45 {

	public static void main(String[] args) {
		int x = 100;
		int y = 97;
		
		
		int resultOfAddition = AnonymousP45.performOperation(x, y, new AnonymousP45(){
			public int operation(int a, int b) {
				return a + b;
			}
		});
		
		int resultOfSubtraction= AnonymousP45.performOperation(x, y, new AnonymousP45(){
			public int operation(int a, int b) {
				return a - b;
			}
		});
	
		System.out.println("Addition " + resultOfAddition);
		System.out.println("Addition " + resultOfSubtraction);
		}
}
