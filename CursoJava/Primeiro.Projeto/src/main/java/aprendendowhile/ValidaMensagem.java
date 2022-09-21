package aprendendowhile;

public class ValidaMensagem {

	public static void main(String[] args) {
		int qtd = 5;
		boolean msg = false; 
		
		do {
			System.out.println("cliquei na mensagem");
			qtd--;

		}while (msg && qtd > 0);
		System.out.println("sai do while");
	}

}
