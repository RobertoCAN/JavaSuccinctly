package sussinclyPart2;

import java.io.Serializable;

public class Animal implements Serializable{

	float height;
	String name;
	boolean extinct;
	
	public Animal(String name, float height, boolean extinct) {
	
		this.name = name;
		this.height = height;
		this.extinct = extinct;
	}
	
	public void print(){
		System.out.println("Name: " + name + "\n" + 
	"Height: " + height + "\n" + 
	"Extinct: " + extinct + "\n	");
	}
}
