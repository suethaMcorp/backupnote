#Author: cdfmatheus.oliveira@gmail.com

Feature: Pesquisa no google
  Eu como usuario quero acessar o site para realizar uma pesquisa

  
  Scenario: pesquisar o nome da escola no google 
    Given que eu esteja em "https://www.google.com.br"
    When pequisar o nome da escola
    Then valido as informacoes
    
  
  