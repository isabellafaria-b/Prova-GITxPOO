# Questão 1 – Sistema de Gerenciamento de Temporadas da FRC

Uma equipe da **FIRST Robotics Competition (FRC)** deseja criar um sistema para organizar suas temporadas utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java.

---

## Objetivo

Desenvolver um programa em **Java** aplicando os principais conceitos de POO, como:

- Classes e Objetos
- Encapsulamento
- Herança
- Construtores
- Sobrescrita de métodos (`@Override`)
- Associação entre classes

---

# 1. Classe `Temporada`

## Atributos

- `ano`
- `nomeDoDesafio`
- `quantidadeEventos` *(escolha livre)*
- `robotPronto` (`boolean`)

## Métodos

- Construtor
- Getters e Setters
- `iniciarTemporada()`
- `finalizarRobo()`
- `exibirInformacoes()`

---

# 2. Classe `Integrante`

## Atributos

- `nome`
- `idade`
- `cargo`

## Métodos

- Construtor
- Getters
- `exibirInformacoes()`

---

# 3. Classe `Programador`

A classe **herda** de `Integrante`.

## Novo atributo

- `linguagemPrincipal`

## Método

Sobrescreva:

- `exibirInformacoes()`

---

# 4. Classe `Mecanico`

A classe **herda** de `Integrante`.

## Novo atributo

- `especialidade`

## Método

Sobrescreva:

- `exibirInformacoes()`

---

# 5. Classe `Robo`

## Atributos

- nome`
- `peso`
- `velocidade`
- `funcional` (`boolean`)

## Métodos

- Construtor
- Getters e Setters
- `ligar()`
- `desligar()`
- `exibirInformacoes()`

---

# 6. Classe `Main`

No método `main()`, faça o seguinte:

1. Criar uma **temporada**.
2. Criar um **robô**.
3. Criar uma **equipe**.
4. Adicionar à equipe:
   -  Dois programadores;
   -  Dois mecânicos.
5. Criar **dois eventos**.
6. Exibir todas as informações do sistema.

---

## Requisitos

- Utilize boas práticas de programação.
- Organize cada classe em seu próprio arquivo.
- Utilize modificadores de acesso (`private`, `public`).
- Sempre que possível, utilize **encapsulamento**.

---

## Estrutura esperada

```text
src/
├── Integrante.java
├── Programador.java
├── Mecanico.java
├── Robo.java
├── Temporada.java
└── Main.java
```
