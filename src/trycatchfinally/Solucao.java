package trycatchfinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solucao {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 15; i++) {
	            DizzBuzz result = new DizzBuzz();
	            result.fizzBuzz(i);
	        }
	}

}
