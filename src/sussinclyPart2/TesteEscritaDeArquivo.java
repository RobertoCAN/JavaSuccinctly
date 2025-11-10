package sussinclyPart2;

import java.io.FileNotFoundException;

public class TesteEscritaDeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		EscritadeArquivo arquivo = new EscritadeArquivo();
		arquivo.NomeDoArquivo(3+"teste.txt");

		EscritadeArquivo arquivo2 = new EscritadeArquivo();
		arquivo2.NomeDoArquivo2(4+"teste.txt");
	}

}
