package primeiro.projeto;

public class Elseif {

	public static void main(String[] args) {
		boolean dinheiro = false;
		boolean credito = false;
		boolean boleto = true;
		int preco = 10000;
		
		System.out.println("************************************************************");		
        System.out.println("*************************Perfumaria*************************");
        System.out.println("************************************************************");
        System.out.println();
        
        if(dinheiro) {
        	// também posso dar o desconto criando uma variavel com o preço do desconto e fazendo preco - a variavel
        	preco = preco - 200 ;
        	System.out.println("Parabéns pela compra do carro no valor: " + preco);
        	
        } else if (credito) {
        	preco = preco + 100;
        	System.out.println("Parabéns pela compra do carro no valor: " + preco);
        	
        } else if (boleto) {
        	preco = preco *2;
        	
        	System.out.println("Parabéns pela compra do carro no valor: " + preco);
        	
        } else {
        	System.out.println("Compra negada");
        }
        	
       
        }
	
	
	
	
	
	
	
	
	}


