#Author:your.email@your.domain.com


Feature: Realizar pesquisa no Google 
  Eu como usuario quero realizar pesquisa no google para receber as informacoes


Background: Acessar o google 
        Given que eu esteja no "https://www.google.com.br"

  Scenario: pesquisar E2E Treinamentos
        When Pesquisar "E2E Treinamentos"
        Then valido "E2E Treinamentos"
  
Scenario: pesquisar Inovacao
        When Pesquisar "Inovacao" 
        Then valido "Inovacao"

        Scenario: pesquisar felicidade
        When Pesquisar "felicidade"
        Then valido "felicidade"