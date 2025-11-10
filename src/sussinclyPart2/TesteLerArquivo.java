package sussinclyPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLerArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("texto5.txt");
		try {
			Scanner in = new Scanner(file);

			String s = in.nextLine() + in.nextLine();

			int i = in.nextInt();
			float f = in.nextFloat();
			boolean b = in.nextBoolean();
			double d = in.nextDouble();
			
			in.close();
			
			System.out.println("String: " + s + "\n"+
			"int: " + i + "\n" +
			"float: " + f + "f\n" +
			"boolean: " + b + "\n" +
			"double: " + d		);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}

	}

}
