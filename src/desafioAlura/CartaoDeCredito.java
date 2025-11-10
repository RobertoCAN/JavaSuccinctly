package desafioAlura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito {
	private double limite;
	private double saldo;
	private List<Compras> compras;
	private Scanner scanner;
	private double totalSpent = 0;
	
	public CartaoDeCredito(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.scanner = new Scanner(System.in);
		this.compras = new ArrayList<>();
	}

	public boolean lancaCompra(Compras compras) {
		if (this.saldo > compras.getValor()) {
			this.saldo -= compras.getValor();
			this.compras.add(compras);
			return true;
		}
		return false;
	}
	
	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Compras> getCompras() {
		return compras;
	}
	
	
}
