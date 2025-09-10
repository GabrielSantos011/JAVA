# Interfaces Funcionais

- podem conter a notação `@FunctionalInterface` (não obrigatório)

- É uma interface que tem exatamente um método abstrato.

- Pode ter também métodos default e static, mas apenas um método abstrato.

- Servem como alvo para expressões lambda e method references.

- Em resumo: Interface funcional = contrato que pode ser representado por uma função.

```java
@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

public class Teste {
    public static void main(String[] args) {
        // Usando expressão lambda
        Operacao soma = (a, b) -> a + b;
        System.out.println(soma.executar(2, 3)); // 5
    }
}
```