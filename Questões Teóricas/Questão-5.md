## Questão 5
Na classe `Sensor`, o método `ler()` foi sobrescrito (`@Override`) na subclasse `SensorUltrassonico`. Ao criar um objeto da seguinte forma:

```java
Sensor s = new SensorUltrassonico();
s.ler();
```

Qual método será executado em tempo de execução?

- A) O método `ler()` da classe `Sensor`, pois a variável foi declarada com esse tipo.
xx - B) O método `ler()` da classe `SensorUltrassonico`, devido ao polimorfismo.
- C) Nenhum método será executado, pois haverá erro de compilação.
- D) Ambos os métodos serão executados, um após o outro.
