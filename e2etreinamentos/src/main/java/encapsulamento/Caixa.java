package encapsulamento;

public class Caixa {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(20);
		System.out.println("o valor da conta corrente é " + cc.getSaldo());

	}

}
