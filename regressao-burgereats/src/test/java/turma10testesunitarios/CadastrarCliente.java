package turma10testesunitarios;

public class CadastrarCliente {
String msg;
int idadePermitida = 18;
public String CadastrarUsuario(String nome, int idade) {
	
	if(idade >= idadePermitida && !nome.equals(null) && !nome.isBlank() && !nome.isEmpty()) {
		msg ="Cliente cadastrado com sucesso";
	}else if(idade < idadePermitida) {
		msg ="Somente maiores de idade";
	}else if(nome.equals(null)) {
		msg ="Somente maiores de idade";
	}else if (nome.isBlank() && nome.isEmpty()) {
		msg="campo nome invalido" ;
	}
	return msg;
}
}
