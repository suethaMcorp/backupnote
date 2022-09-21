#language:pt 

@jane
Funcionalidade: Cadastrar usuarios 
Como Usuario 
Quero preencher o cadastro
Para enviar o meu formulario de cadastro de usuario

Cenario:  Formulario com dados validos 
Dado que esteja no formulario
Quando preencher o campo nome
E preencher o campo email
E preencher o campo senha 
Quando enviar o formulario 
Entao formulario enviado com sucesso

Cenario:  formulario com dados em branco
Dado que esteja no formulario
Mas nao preencher nenhum dos campos  
Quando enviar o formulario 
Entao sistema traz mensagem preencher o campo

Cenario:  formulario com dados invalidos
Dado que esteja no formulario
Mas preencher todos os campos com dados invalidos
Quando enviar o formulario 
Entao sistema traz mensagem informar dados validos

Cenario:  Formulario com nome  em branco
Dado que esteja no formulario
Mas nao preencher o campo nome
Mas preencher os outros campos 
Quando enviar o formulario 
Entao recebo mensagem preencher campo

Cenario:  Formulario com email em branco
Dado que esteja no formulario
Mas não preencher o campo email
Mas preencher os outros campos 
Quando enviar o formulario 
Entao recebo mensagem preencher campo

Cenario:  Formulario com senha em branco
Dado que esteja no formulario
Mas não preencher o campo senha
Mas preencher os outros campos 
Quando enviar o formulario 
Entao recebo mensagem preencher campo

Cenario:  Formulario com email sem @
Dado que esteja no formulario
Mas preencher um email sem @
Mas preencher os outros campos 
Quando enviar o formulario 
Entao recebo mensagem informar email valido 

Cenario: Validar quantidade de caracteres limite no campo nome
Dado que esteja no formulario
Quando tentar digitar no campo nome mais de 60 caracteres
Entao sistema nao premite continuar digitando

Cenario: Validar quantidade minima de caracteres no campo senha
Dado que esteja no formulario
Quando digitar no campo senha menos de 5  caracteres
Entao sistema traz mensagem digite senha valida

Cenario: Validar quantidade maxima de caracteres no campo senha
Dado que esteja no formulario
Quando tentar digitar no campo senha mais de 15 caracteres
Entao sistema nao premite continuar digitando

Cenario: Validar quantidade maxima de caracteres no campo email
Dado que esteja no formulario
Quando tentar digitar no campo email mais de 60 caracteres
Entao sistema nao premite continuar digitando

