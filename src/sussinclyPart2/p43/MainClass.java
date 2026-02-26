package sussinclyPart2.p43;

public class MainClass {

	static class MathOperation {
		public int operation(int a, int b) {
			return 0;
		}
	}

	static int performOperation(int a, int b, MathOperation op) {
		return op.operation(a, b);
	}

	public static void main(String[] args) {
		int x = 100;
		int y = 97;

		int resutOfAddition = performOperation(x, y, new MathOperation() {
			public int operation(int a, int b) {
				return a + b;
			}
		});
		
		int resutOfSubtraction = performOperation(x, y, new MathOperation() {
			public int operation(int a, int b) {
				return a - b;
			}
		});
		System.out.println("Addition " + resutOfAddition);
		System.out.println("Subtraction " + resutOfSubtraction);
	}

}
