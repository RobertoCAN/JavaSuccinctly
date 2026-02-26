package br.com.interfacesestdudo;

public class Carro implements Veiculo {

	@Override
	public void iniciar() {
		System.out.println("Ligando carro");
	}

	@Override
	public void parar() {
		System.out.println("Desligando carro");
	}
	
	

}
