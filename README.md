# Atividade de Polimorfismo em Java

Este projeto é dividido em dois pacotes principais, cada um abordando diferentes aspectos dos exercícios de polimorfismo. Abaixo está uma explicação para entender melhor sobre a estrutura do projeto.

## Estrutura do Projeto

### Pacote `Exercicio1-Exercicio4`

Este pacote contém a implementação dos primeiros quatro exercícios, focando na modelagem e comportamento de diferentes tipos de animais.

- **`abstracts`:** Contém a classe abstrata `Animal`, que serve como base para todos os animais modelados no projeto.

- **`model`:** Contém as classes que representam os diferentes animais (`Cachorro`, `Cavalo`, `Preguica`), além de `Veterinario` e `Zoologico`. Cada classe possui métodos específicos relacionados ao comportamento dos animais, como emissão de sons e correr.

- **`testeExercicios`:** Este pacote foi criado para organizar os testes de cada etapa dos exercícios. 
  - **`TesteAnimalAndVeterinario`:** Testa os comportamentos dos animais e as interações com o veterinário.
  - **`TesteZoologico`:** Testa a funcionalidade do zoológico, incluindo a interação com as jaulas e a execução de métodos de som e corrida.

- **`main`:** O método `main` aqui é responsável por chamar os métodos de teste das classes `TesteAnimalAndVeterinario` e `TesteZoologico`, evitando a poluição do código com testes diretos.

### Pacote `Exercicio5-Exercicio11`

Este pacote aborda a implementação de funcionalidades relacionadas a funcionários e suas respectivas comissões, que foram pedidas nas atividades 5 ate a atividade 11.

- **`abstracts`:** Contém a classe abstrata `Funcionario`, que serve como base para os diferentes tipos de funcionários no projeto.

- **`comissao`:** 
  - **`interfaces`:** Contém a interface `Comissao`, que define a estrutura para as diferentes comissões.
  - **`model`:** Contém as classes que implementam a interface `Comissao`, como `ComissaoGerente`, `ComissaoSupervisor` e `ComissaoVendedor`. Cada classe específica de comissão adiciona um valor ao salário base do funcionário.

- **`empresa`:** Contém a classe `Empresa`, que é responsável por testar toda a lógica implementada, desde a inserção de funcionários em um array, cálculo dos custos totais com salários, até a listagem dos funcionários, suas comissões e o valor total de seus salários.

- **`model`:** Contém as classes que modelam os diferentes tipos de funcionários: `FuncionarioBasico`, `FuncionarioMedio` e `FuncionarioGraduado`.

- **`main`:** Assim como no primeiro pacote, o `main` aqui é responsável por chamar as funções de teste contidas na classe `Empresa`, mantendo o código organizado e separado.
