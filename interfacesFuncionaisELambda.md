# Interfaces Funcionais

- podem conter a notação `@FunctionalInterface` (não obrigatório)

- É uma interface que tem exatamente um método abstrato.

- Pode ter também métodos default e static, mas apenas um método abstrato.

- Servem como alvo para **expressões lambda** e **method references**.

- Em resumo: Interface funcional = contrato que pode ser representado por uma função.

## expressões lambda
é uma forma concisa de implementar interfaces funcionais (interfaces com **um único método abstrato**).  
Foi introduzida no **Java 8** e permite escrever código mais enxuto e expressivo.

Sintaxe básica:
```
(parametros) -> expressão
```
ou
```
(parametros) -> { corpo do método }
```
Exemplo:

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

## Principais Interfaces Funcionais do Java

As principais **interfaces funcionais** do Java fazem parte do pacote `java.util.function`. Elas são fundamentais para programação funcional, permitindo expressões lambda e referências a métodos.

### 1. `Predicate<T>`

Representa uma função que testa uma condição e retorna um `boolean`.

- **Método principal:** `boolean test(T t)`

#### Exemplo:
```java
Predicate<Integer> isEven = x -> x % 2 == 0;
System.out.println(isEven.test(4)); // true
```


### 2. `Function<T, R>`

Representa uma função que recebe um argumento e retorna um valor.

- **Método principal:** `R apply(T t)`

#### Exemplo:
```java
Function<String, Integer> length = s -> s.length();
System.out.println(length.apply("Java")); // 4
```

### 3. `Consumer<T>`

Representa uma operação que recebe um argumento e não retorna nada.

- **Método principal:** `void accept(T t)`

#### Exemplo:
```java
Consumer<String> print = s -> System.out.println(s);
print.accept("Hello, Java!"); // "Hello, Java!"
```

---

### 4. `Supplier<T>`

Representa uma função que não recebe argumentos e retorna um valor.

- **Método principal:** `T get()`

#### Exemplo:
```java
Supplier<Double> random = () -> Math.random();
System.out.println(random.get()); // Exemplo: 0.6789123
```

### 5. `UnaryOperator<T>`

É uma especialização de `Function<T, T>` (entrada e saída do mesmo tipo).

- **Método principal:** `T apply(T t)`

#### Exemplo:
```java
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(5)); // 25
```

### 6. `BinaryOperator<T>`

Recebe dois argumentos do mesmo tipo e retorna um valor do mesmo tipo.

- **Método principal:** `T apply(T t1, T t2)`

#### Exemplo:
```java
BinaryOperator<Integer> sum = (a, b) -> a + b;
System.out.println(sum.apply(3, 7)); // 10
```

## Antes do Java 8
Antes do Java 8, para implementar interfaces funcionais, era comum usar **classes anônimas**:

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Executando...");
    }
};
r.run(); // Executando...
```

## Method References
são uma evolução das lambdas para tornar o código mais legível e menos verboso.

```java
List<String> nomes = Arrays.asList("Ana", "João", "Pedro");

// Lambda
nomes.forEach(s -> System.out.println(s));

// Method reference
nomes.forEach(System.out::println);
```

é uma forma concisa de referenciar métodos existentes (estáticos ou de instância) sem precisar escrever explicitamente uma lambda.  

```
ClasseOuInstancia::metodo
```