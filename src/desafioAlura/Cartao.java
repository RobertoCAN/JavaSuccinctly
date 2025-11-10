package desafioAlura;

public class Cartao {

	protected String nome;
	protected int limit;
	
	public Cartao(String nome , int limit) {
		this.nome = nome;
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}
	
	public void pagamento(int preco) {
		this.limit -= preco;
	}
	
}
