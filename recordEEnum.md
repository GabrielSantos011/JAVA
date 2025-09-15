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

# Enums

`enum` (abreviação de *enumeration*) é um tipo especial no Java usado para representar **um conjunto fixo de constantes**.  
Por exemplo, dias da semana, meses do ano, estados de um pedido etc.

Sintaxe Base:
```java
public enum Prioridade {
    BAIXA, MEDIA, ALTA
}
```

uso:
```java
Prioridade prioridade = Prioridade.ALTA;

if (prioridade == Prioridade.ALTA) {
    System.out.println("URGENTE!");
}
```

## Características Principais

- São implicitamente public static final.
- Podem ter atributos, construtores e métodos.
- Não podem ser instanciados com new.
- Podem implementar interfaces (mas não herdar de classes).

## Métodos Úteis de Enums
```java
// Retorna todas as constantes
Prioridade[] prioridades = Prioridade.values();

// Converte String para Enum
Prioridade p = Prioridade.valueOf("ALTA");

// Pega posição (ordinal) do enum
System.out.println(Prioridade.BAIXA.ordinal()); // 0
```

## Enums com Atributos e Construtores

Enums podem ter valores associados:
```java
public enum Prioridade {
    BAIXA(1),
    MEDIA(5),
    ALTA(10);

    private int valor;

    //construtor é privado - embora não coloquemos o modificador fica implicito que ele é privado pois se trata de um enum
    Prioridade(int valor) {
        this.valor = valor;
    }

    //podemos ter métodos nas enums
    public int getValor() {
        return valor;
    }

}
```

uso:
```java
Prioridade p = Prioridade.MEDIA;

System.out.println(Prioridade.MEDIA.getValor()); // 5
```

## Enums com Métodos Abstratos

Enums também podem ter comportamentos diferentes em cada constante:
```java
public enum Operacao {
    SOMAR {
        public double executar(double a, double b) {
            return a + b;
        }
    },
    MULTIPLICAR {
        public double executar(double a, double b) {
            return a * b;
        }
    };

    public abstract double executar(double a, double b);
}
```

Uso:
```java
double resultado = Operacao.SOMAR.executar(2, 3); // 5.0
```

## Enums em Switch

Enums são frequentemente usados em switch:
```java
switch (hoje) {
    case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> 
        System.out.println("Dia útil");
    case SABADO, DOMINGO -> 
        System.out.println("Fim de semana!");
}
```

## Por que Enums não podem herdar classes mas podem implementar interfaces?

No Java, todas as enums já herdam automaticamente de java.lang.Enum.

Como Java não suporta herança múltipla, um enum não pode herdar de outra classe.

Mas podem implementar quantas interfaces quiserem.

```java
// Interface comum
interface Imprimivel {
    void imprimir();
}

public enum DiaDaSemana implements Imprimivel {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    @Override
    public void imprimir() {
        System.out.println("Hoje é " + this.name());
    }
}

class Main {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEXTA;
        hoje.imprimir(); 
        // Saída: Hoje é SEXTA
    }
}
```
Aqui, DiaDaSemana não pode herdar de uma classe qualquer, mas pode implementar a interface Imprimivel.

## Enum com constantes que recebem uma interface funcional
```java
@FunctionalInterface
interface Operacao {
    double executar(double a, double b);
}

public enum Calculadora {
    SOMA((a, b) -> a + b),
    SUBTRACAO((a, b) -> a - b),
    MULTIPLICACAO((a, b) -> a * b),
    DIVISAO((a, b) -> b == 0 ? Double.NaN : a / b);

    private final Operacao operacao;

    // Construtor do enum
    Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public double aplicar(double a, double b) {
        return operacao.executar(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Calculadora.SOMA.aplicar(5, 3));          // 8.0
        System.out.println(Calculadora.SUBTRACAO.aplicar(5, 3));     // 2.0
        System.out.println(Calculadora.MULTIPLICACAO.aplicar(5, 3)); // 15.0
        System.out.println(Calculadora.DIVISAO.aplicar(5, 0));       // NaN
    }
}
```