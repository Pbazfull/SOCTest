#language: pt
#encoding: utf-8

  Funcionalidade: Buscar Credenciado
    Cenario: Buscar credenciado no Guaruja, com o filtro de 20km e Wifi
      Dado que eu estou na pagina "https://ww2.soc.com.br/blog/"
      E siga as instrucoes para chegar na pagina "https://socnet.soc.com.br/"
      Quando eu pesquisar por "Guaruja"
      E Usar o filtro de Area de Pesquisa setado para 20km
      E clicar em no botao de lupa
      Entao devera ser exibida uma lista de credenciados de acordo com os filtros
