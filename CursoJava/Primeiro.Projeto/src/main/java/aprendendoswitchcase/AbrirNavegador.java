package aprendendoswitchcase;

public class AbrirNavegador {

	public static void main(String[] args) {
		String navegador = "Chrome";

		switch (navegador) {
		case "Chrome":
			System.out.println("Abrindo o navegador" + navegador);
			break;

		case "IE":
			System.out.println("Abrindo o navegador" + navegador);
			break;
		case "EDGE":
			System.out.println("Abrindo o navegador" + navegador);
			break;
		case "Firefox":
			System.out.println("Abrindo o navegador" + navegador);
			break;

		default:
			System.out.println("Você precisa selecionar uma das opções validas");
			break;

		}
	}

}
