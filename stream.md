# Stream em Java

Um **Stream** em Java é uma sequência de elementos de uma coleção que permite realizar **operações funcionais** sobre os dados, como **filtragem, transformação, ordenação e agregação**.

- Não armazena dados; é apenas um **pipeline de operações**. (um fluxo de dados) 

- Suporta **operações intermediárias** (que retornam um novo Stream) e **operações terminais** (que produzem um resultado ou efeito colateral).

- Pode ser **sequencial** (`stream()`) ou **paralelo** (`parallelStream()`).

## Métodos de Stream

### Operações Intermediárias

- filter(Predicate<T>) – filtra elementos que atendem a uma condição.
```java
stream.filter(n -> n % 2 == 0);
```

- map(Function<T,R>) – transforma cada elemento.
```java
stream.map(String::toUpperCase);
```

- flatMap(Function<T, Stream<R>>) – transforma e “achata” múltiplos streams em um só.
```java
stream.flatMap(list -> list.stream());
```

- distinct() – remove elementos duplicados.
```java
stream.distinct();
```

- sorted() / sorted(Comparator<T>) – ordena os elementos.
```java
stream.sorted();
```
- peek(Consumer<T>) – executa uma ação sem consumir o stream, útil para debug.
```java
stream.peek(System.out::println);
```
- limit(long n) – limita a quantidade de elementos.
```java
stream.limit(3);
```

- skip(long n) – pula os primeiros n elementos.
```java
stream.skip(2);
```

### Operações Terminais

- forEach(Consumer<T>) – executa uma ação em cada elemento.
```java
stream.forEach(System.out::println);
```

- toArray() / toArray(IntFunction<A[]>) – converte em array.
```java
Object[] arr = stream.toArray();
```

- reduce(BinaryOperator<T>) / reduce(T identity, BinaryOperator<T>) – reduz os elementos a um único valor.
```java
int soma = stream.reduce(0, Integer::sum);
```

- collect(Collector) – coleta os elementos em uma coleção ou resultado específico.
```java
List<String> lista = stream.collect(Collectors.toList());
```

- min(Comparator<T>) / max(Comparator<T>) – retorna menor ou maior elemento.
```java
Optional<Integer> min = stream.min(Integer::compare);
```

- count() – conta elementos do stream.
```java
long qtd = stream.count();
```

- anyMatch(Predicate<T>) – verifica se algum elemento satisfaz a condição.
```java
boolean existePar = stream.anyMatch(n -> n % 2 == 0);
```

- allMatch(Predicate<T>) – verifica se todos os elementos satisfazem a condição.
```java
boolean todosPositivos = stream.allMatch(n -> n > 0);
```

- noneMatch(Predicate<T>) – verifica se nenhum elemento satisfaz a condição.
```java
boolean nenhumNegativo = stream.noneMatch(n -> n < 0);
```

- findFirst() – retorna o primeiro elemento como Optional.
```java
Optional<String> primeiro = stream.findFirst();
```

- findAny() – retorna algum elemento (útil para streams paralelos).
```java
Optional<String> algum = stream.findAny();
```

- Stream.of(...)
```java
Stream<String> s = Stream.of("A", "B", "C");
```

- Arrays.stream(array)
```java
int[] arr = {1,2,3};
IntStream s = Arrays.stream(arr);
```

- Collection.stream() / Collection.parallelStream()
```java
List<String> lista = List.of("A", "B");
lista.stream();
lista.parallelStream();
```

- Stream.generate(Supplier<T>)
```java
Stream.generate(() -> "Oi").limit(3).forEach(System.out::println);
```

- Stream.iterate(seed, UnaryOperator<T>)
```java
Stream.iterate(1, n -> n + 1).limit(5).forEach(System.out::println);
```