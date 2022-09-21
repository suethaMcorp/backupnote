package primeiro.projeto;

public class IfEncadeado {

	public static void main(String[] args) {

		boolean opcao1 = true;
		boolean opcao2 = true;
		boolean opcao3 = true;

		if (opcao1) {
			System.out.println("Entrou na opção1");

			if (opcao2) {
				System.out.println("Entrou na opção2");

				if (opcao3) {
					System.out.println("entrou na opção3");

				} else {
					System.out.println("Não entrou na opção 3");

				}

			} else {
				System.out.println("Não entrou na opção 2");
			}

		} else {
			System.out.println("Não entrou na opção 1");
		}
	}

}
