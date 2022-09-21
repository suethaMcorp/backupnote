#Author: your.email@your.domain.com

@teste
Feature: Cadastro no site da amazon
 como usuario quero acessar o site do amazon para realizar meu cadastro 
 
   

  @tag1
  Scenario: Cadastrando na amazon
    Given que eu esteja no site da amazon
    When eu criar meu cadastro 
    Then valido se o cadastro foi realizado
    

 