package primeiro.projeto;

public class IfEncadeado {

	public static void main(String[] args) {

		boolean opcao1 = true;
		boolean opcao2 = true;
		boolean opcao3 = true;

		if (opcao1) {
			System.out.println("Entrou na op��o1");

			if (opcao2) {
				System.out.println("Entrou na op��o2");

				if (opcao3) {
					System.out.println("entrou na op��o3");

				} else {
					System.out.println("N�o entrou na op��o 3");

				}

			} else {
				System.out.println("N�o entrou na op��o 2");
			}

		} else {
			System.out.println("N�o entrou na op��o 1");
		}
	}

}
