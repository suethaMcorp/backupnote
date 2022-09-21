#language:pt 

@m
Funcionalidade: Cadastro Administrator-X
COMO USUARIO QUERO ME CADASTRAR NO SITE PARA REALIZAR MEU LOGIN


Cenario: Cadastro de usuario
Dado eu esteja no site do Administrator-X
E estiver no formulario
E preencher o nome
E preencher o e-mail
E preencher a senha
Quando finalizar o cadastro
Entao formulario cadastro realizado


Cenario: cadastro com campos em branco
Dado que esteja no formulario de cadastro
E deixar o campo nome em branco
E deixar o campo e-mail em branco
E deixar o campo senha em branco
Quando finalizar o cadastro
Entao validar tooltip com a mensagem de erro


Cenario: cadastro nulo
Dado que esteja no formulario de cadastro
E deixar o campo nome nulo
E deixar o campo e-mail nulo
E deixar o campo senha nula
Quando finalizar o cadastro
Entao validar tooltip com a mensagem de erro


Cenario: cadastro excedendo os caracteres
Dado que esteja no formulario de cadastro
E preencher o nome com mais de 60 caracteres
E preencher o e-mail com mais de 60 caracteres
E preencher o senha com mais de 60 caracteres
Quando finalizar o cadastro
Entao validar tooltip com a mensagem de erro


Cenario: cadastro com e-mail sem o @
Dado que esteja no formulario de cadastro
E preencher o nome
E preencher o e-mail sem o @
E preencher o senha
Quando finalizar o cadastro
Entao validar tooltip com a mensagem de erro


Cenario: senha pequena/grande demais
Dado que esteja no formulario de cadastro
E preencher o nome
E preencher o e-mail
E preencher o senha com 4 ou 16 caracteres
Quando finalizar o cadastro
Entao validar tooltip com a mensagem de erro