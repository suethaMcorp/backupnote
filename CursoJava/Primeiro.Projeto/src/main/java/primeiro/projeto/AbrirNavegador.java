package primeiro.projeto;

public class AbrirNavegador {

	public static void main(String[] args) {
		String navegador = "Chrome";
		
		if (navegador.equalsIgnoreCase("Chrome")) {
			System.out.println(navegador);
		}else if(navegador.equalsIgnoreCase("firefox")) {
			System.out.println(navegador);
		}else if (navegador.equalsIgnoreCase("IE")) {
			System.out.println(navegador);
		} else if (navegador.equalsIgnoreCase("Opera")) {
			System.out.println(navegador);
		} else if (navegador.equalsIgnoreCase("Edge")) {
			System.out.println(navegador);
		} else {
			System.out.println("Navegador invalido");
		}


	}

}
