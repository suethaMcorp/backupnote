package primeiro.projeto;

public class habilitacao {

	public static void main(String[] args) {
		String nome = "Lorenzo" ;
		int idadePermitida = 18;
		int minhaIdade = 17;
		boolean emancipado = false;
		
		if (minhaIdade >=idadePermitida || emancipado ) {
			System.out.println("Voc� pode tirar a habilita��o, Vai na f� , Voc� tem: " +minhaIdade + " Anos " + nome);
		}else {
			System.out.println("Voc� n�o pode tirar a habilita��o, s� lamentos , Voc� s� tem: " +minhaIdade + " Anos " + nome);
			
		}

	}

}
