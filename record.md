# Record

- É uma classe especial que serve principalmente para armazenar dados.

- Ele reduz boilerplate, porque já cria automaticamente: constructor, getters (component methods), equals(), hashCode(), toString()

- Por padrão, seus campos são final, ou seja, imutáveis.

## Sintaxe básica

```java
public record Pessoa(String nome, int idade) {
}
```

Isso é equivalente a criar manualmente:

```java
public final class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String nome() { return nome; }
    public int idade() { return idade; }

    @Override
    public boolean equals(Object o) { ... }
    @Override
    public int hashCode() { ... }
    @Override
    public String toString() { ... }
}
```

## Usando um Record
```java
public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gabriel", 23);

        System.out.println(p.nome());  // Gabriel
        System.out.println(p.idade()); // 23
        System.out.println(p);          // Pessoa[nome=Gabriel, idade=23]
    }
}
```
Repare que os getters não começam com get, mas sim com o nome do campo (p.nome()).

## Customizando Records

podemos adicionar:

- Métodos adicionais

- Construtor compacto

- Validações

```java
public record Pessoa(String nome, int idade) {
    // Construtor compacto
    public Pessoa {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa");
    }

    // Método adicional
    public String saudacao() {
        return "Olá, meu nome é " + nome;
    }
}

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana", 25);
        System.out.println(p.saudacao()); // Olá, meu nome é Ana
    }
}
```

## Características importantes

Imutabilidade -> Campos final por padrão
Redução de boilerplate -> equals, hashCode, toString gerados automaticamente
Subclasses -> Records não podem ser estendidos
Interfaces -> Podem implementar interfaces
Modificador static -> Pode ter métodos static

## Quando usar Records

- Quando você precisa de objetos simples para transportar dados (“DTOs”).

- Quando a imutabilidade é desejável.

- Quando você quer menos código repetitivo.