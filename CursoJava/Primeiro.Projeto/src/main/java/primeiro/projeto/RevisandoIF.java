package primeiro.projeto;

public class RevisandoIF {

	public static void main(String[] args) {
		int media = 6;
		double nota1 = 5.5;
		double nota2 = 6;
		double nota3 = 7.6;
		double mediaTotal = (nota1+nota2+nota3)/3;
		
		if(mediaTotal >= media) {
			System.out.println("Voc� passou, n�o vai tomar um coro e sua media �: " + mediaTotal);
		}else {
			System.out.println("Voc� n�o passou, Vai toma um coro de fio de ferro, deu ruim, a bosta de sua m�dia �: " + mediaTotal);
		}
		

	}

}
