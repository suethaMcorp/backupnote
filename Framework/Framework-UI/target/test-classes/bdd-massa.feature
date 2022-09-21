#Author: your.email@your.domain.com

Feature: Pesquisar no google 
 Eu como usuario quero realizar uma pesquisa no google para validar informações

   
  Scenario Outline: Pesquisar no google 
    Given que eu esteja no "https://www.google.com.br"
    When Pesquisar <pesquisa> 
    Then visualizo as <informacoes>

    Examples: 
      | pesquisa     | informacoes |  
      |"banco itau"  |"banco itau"  |
      |"TRT2"        |"TRT2"        |
      |"Warzone"     |"Warzone"     |
