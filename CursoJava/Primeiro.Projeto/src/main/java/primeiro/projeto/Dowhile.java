package primeiro.projeto;

public class Dowhile {

	public static void main(String[] args) {
		int numero1 = 20;
		int numero2 = 20;
		
		do {
			System.out.println("Entrei no while, o numero1 vale:" + numero1);
			numero1 = numero1 + 1;
			//numero1 += 1; ou numero1++;
		}while(numero1< numero2);
		
		System.out.println("Sai no while, o numero1 vale:" + numero1);
	}

}
