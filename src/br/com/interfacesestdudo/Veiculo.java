package br.com.interfacesestdudo;

public interface Veiculo {
	public String placa = "";
	public float velMax = 0;
	public void iniciar();
	public void parar();
	default void buzinar() {
		System.out.println("Fon Fon");
	}
	
}
