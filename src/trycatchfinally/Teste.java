package trycatchfinally;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaisUmTryCatch catch1 = new MaisUmTryCatch();
		
		List list = new ArrayList<>(); 
		list .add(5.4); list .add(1.2); 
		Optional opt = list .stream().sorted().findFirst();
		System. out .print( opt .get() + ""+"" + list .get(0)); }
	
}
