package sussinclyPart2.p39;

import java.util.ArrayList;
import java.util.Collections;

public class TestePoint {

	public static void main(String[] args) {
		int numberOfPoints = 5;
		
		ArrayList<Point> points = new ArrayList<Point>();
		
		for (int i = 0; i < numberOfPoints; i++)
			points.add(new Point(Math.random()*10,  Math.random()*10));
		
		System.out.println("Unsorted: ");
		for (int i = 0; i < numberOfPoints; i++)
			points.get(i).print();
		
		Collections.sort(points);
		System.out.println("Sortead: ");
		
		for (int i = 0; i < numberOfPoints; i++)
			points.get(i).print();
		
		points.sort(Collections.reverseOrder());
		
		System.out.println("Sorted in reverse: ");
		for (int i = 0; i < numberOfPoints; i++) 
			points.get(i).print();
		
	}

}
