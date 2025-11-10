package sussinclyPart2;

import java.util.Scanner;

public class Asser {

	public static void main(String[] args) {
		int num, den;
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Numerador: ");
		num = scann.nextInt();
		
		System.out.println("Denominador: ");
		den = scann.nextInt();
		
		assert(den != 0);
		
		System.out.println(num / den);
		System.out.println(num % den);
	}

}
