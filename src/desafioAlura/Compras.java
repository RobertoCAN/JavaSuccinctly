package desafioAlura;

public class Compras {

//	public class Compras implements Comparable<Compras> {
	
	private String descricao;
	private double valor;

	public Compras(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getProduto() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	
	public String getDescricao() {
		return descricao;
	}

//	@Override
//	public String toString() {
//		return "Compra{" + "descricao= '" + descricao + '\'' + ", valor = " + valor + '}';
//	}

//	@Override
//	public int compareTo(Compras o) {
//
//		return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
//	}
}
