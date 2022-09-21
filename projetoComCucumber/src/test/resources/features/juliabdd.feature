#language:pt 

@ju
Funcionalidade: Criar Cadastro de usuario
Como usuario 
Quero preencher meu nome, email e senha
Para realizar meu cadastro


Cenario:  formulario com dados validos
Dado que esteja no formulario
Quando preencher o campo nome 
E preencher o campo email
E preencher o campo senha
Quando enviar o formulario
Entao formulario enviado com sucesso

Cenario:  formulario com dados em Branco
Dado que esteja no formulario
Quando preencher o campo nome
Mas deixar o campo email e senha em branco
Entao sistema deve mostrar um tooltip ao clicar no botao cadastrar
E informando para preencher o campo.


Cenario:  formulario com mais de 60 caracteres
Dado que esteja no formulario
Quando for preencher os campos
Mas colocar os dados com mais de 60 caracteres
Entao formulario nao devera ser aceito.

Cenario:  formulario com menos de 5 caracteres
Dado que esteja no formulario
Quando for preencher os campos
Mas colocar os dados com menos de 5 caracteres
Entao formulario não devera ser aceito.

Cenario:  formulario com usuario ja cadastrado
Dado que esteja no formulario
Quando for preencher os campos
Mas colocar os dados de um usuario ja cadastrado
Entao o Sistema nao ira realizar a validacao previa e concluira o cadastro de imediato.