# Questão 2 – Sistema de Gerenciamento de Eventos e Equipe (FRC)

Dando continuidade ao sistema desenvolvido na Questão 1, a equipe de **FRC** deseja expandir o programa para gerenciar **eventos** e organizar sua **equipe** de forma mais completa, aplicando conceitos adicionais de **Programação Orientada a Objetos (POO)** em Java.

---

## Objetivo

Desenvolver a continuação do sistema em **Java**, aplicando:

- Classes e Objetos
- Encapsulamento
- Herança
- Polimorfismo
- Classes abstratas e/ou Interfaces
- Coleções (`ArrayList`)
- Associação e Composição entre classes

---

# 1. Interface `Notificavel`

Crie uma **interface** chamada `Notificavel` com o seguinte método:

- `notificar(String mensagem)`

---

# 2. Classe abstrata `Integrante`

Transforme a classe `Integrante` (criada na Questão 1) em uma **classe abstrata**, que **implementa** a interface `Notificavel`.

## Atributos
- `nome`
- `idade`
- `cargo`

## Métodos
- Construtor
- Getters
- Método **abstrato**: `exibirInformacoes()`
- Implementação do método `notificar(String mensagem)`, exibindo uma mensagem personalizada com o nome do integrante

> As classes `Programador` e `Mecanico` continuam herdando de `Integrante` e devem sobrescrever `exibirInformacoes()`, além de herdar `notificar()`.

---

# 3. Classe `Evento`

## Atributos
- `nomeEvento`
- `local`
- `data`
- `pontuacaoObtida` *(escolha livre o tipo)*

## Métodos
- Construtor
- Getters e Setters
- `exibirInformacoes()`

---

# 4. Classe `Equipe`

## Atributos
- `nomeEquipe`
- `ArrayList<Integrante> integrantes`
- `ArrayList<Evento> eventos`

## Métodos
- Construtor
- `adicionarIntegrante(Integrante integrante)`
- `adicionarEvento(Evento evento)`
- `exibirIntegrantes()` — deve percorrer a lista e chamar `exibirInformacoes()` de cada integrante, demonstrando **polimorfismo**
- `exibirEventos()` — deve percorrer a lista e chamar `exibirInformacoes()` de cada evento
- `notificarTodos(String mensagem)` — deve percorrer a lista de integrantes e chamar o método `notificar()` de cada um

---

# 5. Classe `Temporada` (atualização)

Adicione à classe `Temporada` (criada na Questão 1):

## Novo atributo
- `Equipe equipe` *(associação/composição)*

## Novo método
- `exibirResumoTemporada()` — deve exibir as informações da temporada e, em seguida, chamar `exibirIntegrantes()` e `exibirEventos()` da equipe associada

---

# 6. Classe `Main`

No método `main()`, faça o seguinte:

1. Criar uma **equipe**.
2. Criar **dois programadores** e **dois mecânicos**, adicionando-os à equipe.
3. Criar **dois eventos**, adicionando-os à equipe.
4. Criar uma **temporada**, associando a equipe criada.
5. Chamar `exibirResumoTemporada()`.
6. Chamar `notificarTodos()` passando uma mensagem, por exemplo: `"Reunião marcada para amanhã às 18h."`

---

## Requisitos

- Utilize boas práticas de programação.
- Organize cada classe/interface em seu próprio arquivo.
- Utilize modificadores de acesso (`private`, `public`, `protected`).
- Demonstre **polimorfismo** de forma explícita ao percorrer a lista de integrantes.
- Sempre que possível, utilize **encapsulamento**.

---

## Estrutura esperada

```text
src/
├── Notificavel.java
├── Integrante.java
├── Programador.java
├── Mecanico.java
├── Evento.java
├── Equipe.java
├── Robo.java
├── Temporada.java
└── Main.java
```
