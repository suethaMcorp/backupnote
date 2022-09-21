#Author: your.email@your.domain.com

@regressive
Feature: Cadastrar um novo usuario
  como usuario quero acessar o formulario para realizar cadastro

  @cadastrarUsuario
  Scenario: cadastrar usuario
    Given que acesse o formulario para cadastrar um novo usuario
    When preencher todos os campos obrigatorios no formulario
    And clicar no botao cadastrar do formulario
    Then formulario de cadastro de usuario enviado
