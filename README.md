# JAVA
Repositório onde colocarei sintaxe e exemplos 

## Primeiro código Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

---

## Variáveis

Uma **variável** é um espaço na memória usado para armazenar valores durante a execução do programa.  
No Java, cada variável tem **tipo** (define o que pode armazenar) e **nome** (identificador).

**Sintaxe:**
```java
tipo nome = valor;
```

### Tipos Primitivos
Esses tipos armazenam valores simples diretamente na memória.

| Tipo     | Tamanho | Valor Padrão | Faixa de Valores |
|----------|---------|--------------|------------------|
| `byte`   | 8 bits  | 0            | -128 a 127 |
| `short`  | 16 bits | 0            | -32.768 a 32.767 |
| `int`    | 32 bits | 0            | -2.147.483.648 a 2.147.483.647 |
| `long`   | 64 bits | 0L           | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |
| `float`  | 32 bits | 0.0f         | ~ ±3.40282347E+38F (6–7 dígitos decimais) |
| `double` | 64 bits | 0.0d         | ~ ±1.79769313486231570E+308 (15 dígitos decimais) |
| `char`   | 16 bits | '\u0000'     | Qualquer caractere Unicode (0 a 65.535) |
| `boolean`| 1 bit*  | false        | `true` ou `false` |

> \*O tamanho de `boolean` não é definido exatamente em bits na JVM, mas em geral ocupa 1 byte.

### Tipos de Referência
Esses tipos armazenam **endereços** de memória para objetos, não os valores diretamente.

| Tipo           | Exemplo                      | Valor Padrão |
|----------------|------------------------------|--------------|
| `String`       | `"Olá"`                      | `null` |
| Classes        | `Pessoa p = new Pessoa();`   | `null` |
| Interfaces     | `Runnable r;`                | `null` |
| Arrays         | `int[] numeros = {1,2,3};`   | `null` (se não inicializado) |

#### Tipos Especiais
| Tipo      | Uso                                               |
|-----------|---------------------------------------------------|
| `var`     | Inferência de tipo local (Java 10+)               |
| `record`  | Tipo de dado imutável para armazenar valores (Java 14+) |
| `enum`    | Conjunto fixo de constantes nomeadas              |
| `null`    | Representa ausência de valor para tipos de referência |

### Observações Importantes
- Tipos primitivos **não aceitam `null`**.
- Tipos de referência **aceitam `null`**.
- Conversões:
  - **Implícita (widening)**: `int → long → float → double`
  - **Explícita (casting)**: `(int) 3.14` → `3`
- Classes **Wrapper** permitem tratar tipos primitivos como objetos:
  - `Integer`, `Double`, `Character`, `Boolean`, etc.

### Operadores Aritméticos
| Operador | Descrição       | Exemplo | Resultado |
| -------- | --------------- | ------- | --------- |
| +        | Adição          | 5 + 3   | 8         |
| -        | Subtração       | 5 - 3   | 2         |
| \*       | Multiplicação   | 5 \* 3  | 15        |
| /        | Divisão inteira | 5 / 2   | 2         |
| %        | Resto           | 5 % 2   | 1         |
| ++       | Incremento      | x++     | x + 1     |
| --       | Decremento      | x--     | x - 1     |

### Operadores Lógicos
| Operador | Descrição | Exemplo         | Resultado |
| -------- | --------- | --------------- | --------- |
| &&       | E (AND)   | true && false   | false     |
| \|\|     | OU (OR)   | true \|\| false | true      |
| !        | NÃO (NOT) | !true           | false     |

---

## Estruturas de Controle

### if / else if / else
Permite executar blocos de código apenas se a condição for verdadeira.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else if (idade >= 16) {
    System.out.println("Pode votar");
} else {
    System.out.println("Menor de idade");
}
```

### switch
Usado para selecionar entre múltiplas opções.

```java
int dia = 3;

switch (dia) {
    case 1: System.out.println("Segunda"); break;
    case 2: System.out.println("Terça"); break;
    case 3: System.out.println("Quarta"); break;
    default: System.out.println("Outro dia");
}
```

### Laços de Repetição (Loops)

#### For
Usado quando se sabe o número de repetições:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

#### While
Executa enquanto a condição for verdadeira:

```java
int contador = 0;
while (contador < 5) {
    System.out.println(contador);
    contador++;
}
```

#### Do-While
Executa pelo menos uma vez, depois testa a condição:

```java
int x = 0;
do {
    System.out.println(x);
    x++;
} while (x < 5);
```

For-Each
Percorre elementos de arrays e coleções:

```java
int[] numeros = {1, 2, 3};
for (int n : numeros) {
    System.out.println(n);
}
```
