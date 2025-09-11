# Collections em Java

## Introdução
O Java possui a **Collections Framework**, um conjunto de interfaces, classes e algoritmos
que facilitam o trabalho com **estruturas de dados** como listas, filas, pilhas, conjuntos e mapas.

Antes das Collections, os programadores usavam arrays e classes utilitárias (como `Vector` e `Hashtable`),
mas elas tinham limitações de flexibilidade e legibilidade.

---

## Evolução

### 1. Arrays (pré-Java 2)
```java
int[] numeros = {1, 2, 3, 4};
System.out.println(numeros[0]); // 1
```
- Fixos em tamanho.
- Poucos métodos utilitários.
- Precisávamos reinventar muitas estruturas de dados.

### 2. Classes Antigas (`Vector`, `Hashtable`)
```java
Vector<String> nomes = new Vector<>();
nomes.add("João");
nomes.add("Maria");

Hashtable<Integer, String> tabela = new Hashtable<>();
tabela.put(1, "Um");
tabela.put(2, "Dois");
```
- síncronas 
- mais lentas
- Não seguiam um padrão uniforme.

### 3. Java Collections Framework (Java 2 - JDK 1.2)
Introduziu interfaces e classes padronizadas:

- **List** → `ArrayList`, `LinkedList` → permite elementos duplicados, mantém ordem.
- **Set** → `HashSet`, `TreeSet` → não permite duplicados, não garante ordem.
- **Map** → `HashMap`, `TreeMap` → pares chave/valor, chave única. → não extende Collection mas faz parte do Collection Framework
- **Queue** → `LinkedList`, `PriorityQueue` → fila de processamento, FIFO ou prioridade.

```java
List<String> lista = new ArrayList<>();
lista.add("A");
lista.add("B");
System.out.println(lista.get(0)); // A

Set<Integer> numeros = new HashSet<>();
numeros.add(1);
numeros.add(2);
numeros.add(2); // não será adicionado
System.out.println(numeros); // [1, 2]

Queue<String> fila = new LinkedList<>();
fila.add("Primeiro");
fila.add("Segundo");
fila.add("Terceiro");
System.out.println(fila); // [Primeiro, Segundo, Terceiro]
System.out.println(fila.poll()); // Primeiro (remove o primeiro da fila)
System.out.println(fila); // [Segundo, Terceiro]

Map<Integer, String> mapa = new HashMap<>();
mapa.put(1, "João");
mapa.put(2, "Maria");
mapa.put(3, "Ana");
System.out.println(mapa); // {1=João, 2=Maria, 3=Ana}
System.out.println(mapa.get(2)); // Maria
mapa.put(2, "Mariana"); // atualiza o valor da chave 2
System.out.println(mapa.get(2)); // Mariana
```

---

## Generics (Java 5)
Antes, usava-se `Collection` sem tipo definido. Isso causava `ClassCastException`.
Com **Generics**, conseguimos segurança de tipos.

```java
List<String> nomes = new ArrayList<>();
nomes.add("João");
// nomes.add(10); // erro em tempo de compilação
```

---

## Iteração Tradicional

```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

for (String nome : nomes) {
    System.out.println(nome);
}
```

---

## Streams (Java 8)
A API de **Streams** trouxe uma forma declarativa e funcional de trabalhar com dados.

mais a frente falarei sobre interface funcional e lambdas e retomo o assunto.
