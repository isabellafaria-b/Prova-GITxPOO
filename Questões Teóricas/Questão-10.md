### Questão 10

Considere as seguintes classes do sistema de gerenciamento de temporadas da FRC:

- `Integrante`
- `Programador`, que herda de `Integrante`
- `Mecanico`, que herda de `Integrante`

Analise o trecho de código abaixo:

```java
Integrante integrante = new Programador();
```

Sobre essa declaração, assinale a alternativa correta.

**A)** A declaração é inválida, pois uma variável do tipo `Integrante` não pode armazenar um objeto da classe `Programador`.

xx - **B)** A declaração é válida, pois `Programador` herda de `Integrante`, permitindo que uma referência da superclasse aponte para um objeto da subclasse.

**C)** A declaração é válida apenas se a classe `Integrante` for declarada como `abstract`.

**D)** A declaração é inválida, pois um objeto só pode ser armazenado em uma variável do seu próprio tipo.
