#Author: your.email@your.domain.com

@regressao
Feature: Enviar formulario de cadastro de novos fonrcedores
  Como prestador de servico quero enviar os meus dados para realizar meu cadastro
  
Background: Acessar o formulario de Cadastro
Given que o prestador acesse o formulario de cadastro

  @motoca
  Scenario: Cadastrar entregador com moto
    When preencher os dados pessoais do entregador
    And preencher os dados de endereco do entregador
    And preencher os dados de entrega moto
    And anexar o documento
    Then enviamos o formulario
    And validamos a confirmacao
    
    @bike
    Scenario: Cadastrar entregador com bicicleta
    When preencher os dados pessoais do entregador
    And preencher os dados de endereco do entregador
    And preencher os dados de entrega bicicleta
    And anexar o documento
    Then enviamos o formulario
    And validamos a confirmacao
    
    @van
    Scenario: Cadastrar entregador com van-carro
    When preencher os dados pessoais do entregador
    And preencher os dados de endereco do entregador
    And preencher os dados de entrega van-carro
    And anexar o documento
    Then enviamos o formulario
    And validamos a confirmacao
    
    @maismetodo
    Scenario: Cadastrar mais de um metodo
    When preencher os dados pessoais do entregador
    And preencher os dados de endereco do entregador
    But preencher mais de um metodo de entrega
    And anexar o documento
    Then enviamos o formulario
    And validamos mensagem de erro
    @tag1
    Scenario: Cadastrar sem preencher os dados obrigatorios
    Then enviamos o formulario
    And validamos a mensagem de erro sobre os campos obrigatorios
    @tag2
    Scenario: Cadastrar sem anexar documentos
    When preencher os dados pessoais do entregador
    And preencher os dados de endereco do entregador
    And preencher os dados de entrega moto
    But sem anexar o documento do prestador
    Then enviamos o formulario
    And validamos a mensagem de erro sobre a falta do documento

  
