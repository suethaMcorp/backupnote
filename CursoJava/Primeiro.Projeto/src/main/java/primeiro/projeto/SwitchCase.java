package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {

		// 1 A vista | 2 Credito | 3 Boleto
		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 10.000;
		double saldoCartao = 4.000;

		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o a vista'");

			if (saldoCliente >= valorProduto) {
				System.out.println("Compra realizada com sucesso");

			} else {
				System.out.println("Compra negada: Saldo insuficiente");

			}
			break;

		case 2:
			System.out.println("Voc� escolheu a op��o Credito'");
			if (saldoCartao >= valorProduto) {
				System.out.println("Compra com cart�o de credito realizada com sucesso");
			}else {
				System.out.println("Compra negada, contate o seu banco para mais informa��es");
			}
			
			
			break;

		case 3:
			System.out.println("Voc� escolheu a op��o Boleto'");
			break;

		default:
			System.out.println("Voc� precisa selecionar uma das op��es validas");
			break;

		}

	}

}
