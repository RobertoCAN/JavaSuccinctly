package sussinclyPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritadeArquivo {

	public String nome;

	public void NomeDoArquivo(String nome) throws FileNotFoundException {

		this.nome = nome;
		File file = new File(this.nome);
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.println("Este é um exemplo de texto para o arquivo" + nome);
		printWriter.close();
	}
	
	public void NomeDoArquivo2(String nome) {
		try {
			File file = new File(nome);
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.println("Este é um exemplo semelhante!" + nome);
			printWriter.close();
		} catch (Exception e) {
			System.out.println("O arquivo não pode ser aberto!");
		}
		
	}

}
