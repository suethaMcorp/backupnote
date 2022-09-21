package primeiro.projeto;

public class habilitacao {

	public static void main(String[] args) {
		String nome = "Lorenzo" ;
		int idadePermitida = 18;
		int minhaIdade = 17;
		boolean emancipado = false;
		
		if (minhaIdade >=idadePermitida || emancipado ) {
			System.out.println("Você pode tirar a habilitação, Vai na fé , Você tem: " +minhaIdade + " Anos " + nome);
		}else {
			System.out.println("Você não pode tirar a habilitação, só lamentos , Você só tem: " +minhaIdade + " Anos " + nome);
			
		}

	}

}
