#Author:your.email@your.domain.com


Feature: Realizar pesquisa no Google 
  Eu como usuario quero realizar pesquisa no google para receber as informacoes


Background: Acessar o google 
        Given que eu esteja no "https://www.google.com.br"

Scenario: pesquisar e2etreinamentos
        When Pesquisar "e2etreinamentos"
        Then valido nome da escola "E2E Treinamentos"
  
Scenario: pesquisar Inovacao
        When Pesquisar "Inovação" 
        Then valido Inovacao "Inovação"

        Scenario: pesquisar felicidade
        When Pesquisar "felicidade"
        Then valido felicidade "Felicidade"