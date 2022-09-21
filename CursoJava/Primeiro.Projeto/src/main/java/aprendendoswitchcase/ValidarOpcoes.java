package aprendendoswitchcase;

public class ValidarOpcoes {
	public static void main(String[] args) {
		int opcao = 1;

		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;

		case 2:
			System.out.println("Você escolheu a opção 2'");
			break;

		default:
			System.out.println("Você precisa selecionar uma das opções validas");
			break;

		}

	}
}
