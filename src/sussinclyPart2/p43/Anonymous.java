package sussinclyPart2.p43;

public class Anonymous {

	static class OutputLyrics{
		public void output() {
			System.out.println("No lyrics supplied...");
		}
	}
	
	public static void main(String[] args) {
		
		OutputLyrics regularInstance = new OutputLyrics();
		
		OutputLyrics anonymousClass = new OutputLyrics() {
			public void output() {
				System.out.println("Demonst has a barrow in the market place.");
			}
		};

		
		regularInstance.output();
		
		anonymousClass.output();
	}

}
