package primeiro.projeto;

public class Pagamento {
	public static void main(String[] args) {
		String tipoPagamento = "Vista";
		boolean vistaCredito = true; // incluir juros de 1.0
		double valorCompra = 1.000 ;

		if (tipoPagamento.equalsIgnoreCase("Credito")) {

			if (vistaCredito) {
				valorCompra = valorCompra - 1.0;
				System.out.println("Valor Total da compra R$ " + valorCompra);
			}else {
				valorCompra = valorCompra + 1.0;
				System.out.println("Valor Total da compra R$ " + valorCompra);
			}
		} else if (tipoPagamento.equalsIgnoreCase("Vista")) {
			valorCompra = valorCompra - 1.0;
			System.out.println("Valor Total da compra R$ " + valorCompra);
		} else {
			System.out.println("Forma de pagamento invalida");
		}

	}
}
