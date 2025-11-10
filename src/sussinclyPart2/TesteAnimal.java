package sussinclyPart2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class TesteAnimal {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Animal stego = new Animal("Stegosaurus", 12.5f , true);
		Animal croc = new Animal("Crovodile", 3.2f , false);
		Animal mozzie = new Animal("Mosquito", 0.2f, false);
		
//		stego.print();
//		croc.print();
//		mozzie.print();
		
		File file = new File("animals.dat");
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		
		objectOutput.writeObject(stego);
		objectOutput.writeObject(croc);
		objectOutput.writeObject(mozzie);
		
		objectOutput.close();
		fileOutput.close();
		
		//declara o array dos animais para ler
		Animal[] animas = new Animal[3];
		
		//cria um arquivo e um objeto de entrada
		FileInputStream fileImput = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileImput);
		
		//ler os objetos do arquivo
		try {
			for (int i = 0; i < animas.length; i++) {
				animas[i] = (Animal) objectInputStream.readObject();
			}
			//fecha o stream
			objectInputStream.close();
			fileImput.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Ler os objetos do arquivo: \n");
		for (int i = 0; i < animas.length; i++) {
			animas[i].print();
		}
	}
}
