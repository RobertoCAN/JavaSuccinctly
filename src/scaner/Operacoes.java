package scaner;

public class Operacoes {


	public void calcula(int opcao, double param_A, double param_B) {
		switch (opcao) {
		case 1: {
			System.out.println(param_A + " + " + param_B + " = " + (param_A + param_B));
			break;
		}
		case 2: {
			System.out.println(param_A + " + " + param_B + " = " + (param_A - param_B));
			break;
		}
		case 3: {
			System.out.println(param_A +" * " + param_B + " = " + (param_A * param_B));
			break;
		}
		case 4: {
			System.out.println(param_A + " / " + param_B + " = " + (param_A / param_B));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}

}
