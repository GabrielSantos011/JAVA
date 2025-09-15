# Primeiro código Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

---

# Variáveis

Uma **variável** é um espaço na memória usado para armazenar valores durante a execução do programa.  
No Java, cada variável tem **tipo** (define o que pode armazenar) e **nome** (identificador).

**Sintaxe:**
```java
tipo nome = valor;
```

## Tipos Primitivos
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

## Tipos de Referência
Esses tipos armazenam **endereços** de memória para objetos, não os valores diretamente.

| Tipo           | Exemplo                      | Valor Padrão |
|----------------|------------------------------|--------------|
| `String`       | `"Olá"`                      | `null` |
| Classes        | `Pessoa p = new Pessoa();`   | `null` |
| Interfaces     | `Runnable r;`                | `null` |
| Arrays         | `int[] numeros = {1,2,3};`   | `null` (se não inicializado) |

## Tipos Especiais
| Tipo      | Uso                                               |
|-----------|---------------------------------------------------|
| `var`     | Inferência de tipo local (Java 10+)               |
| `record`  | Tipo de dado imutável para armazenar valores (Java 14+) |
| `enum`    | Conjunto fixo de constantes nomeadas              |
| `null`    | Representa ausência de valor para tipos de referência |

## Observações Importantes
- Tipos primitivos **não aceitam `null`**.
- Tipos de referência **aceitam `null`**.
- Conversões:
  - **Implícita (widening)**: `int → long → float → double`
  - **Explícita (casting)**: `(int) 3.14` → `3`
- Classes **Wrapper** permitem tratar tipos primitivos como objetos:
  - `Integer`, `Double`, `Character`, `Boolean`, etc.

# Operadores Aritméticos
| Operador | Descrição       | Exemplo | Resultado |
| -------- | --------------- | ------- | --------- |
| +        | Adição          | 5 + 3   | 8         |
| -        | Subtração       | 5 - 3   | 2         |
| \*       | Multiplicação   | 5 \* 3  | 15        |
| /        | Divisão inteira | 5 / 2   | 2         |
| %        | Resto           | 5 % 2   | 1         |
| ++       | Incremento      | x++     | x + 1     |
| --       | Decremento      | x--     | x - 1     |

# Operadores Lógicos
| Operador | Descrição | Exemplo         | Resultado |
| -------- | --------- | --------------- | --------- |
| &&       | E (AND)   | true && false   | false     |
| \|\|     | OU (OR)   | true \|\| false | true      |
| !        | NÃO (NOT) | !true           | false     |

---

# Estruturas de Controle

## if / else if / else
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

## switch
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

## Laços de Repetição (Loops)

### For
Usado quando se sabe o número de repetições:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

### While
Executa enquanto a condição for verdadeira:

```java
int contador = 0;
while (contador < 5) {
    System.out.println(contador);
    contador++;
}
```

### Do-While
Executa pelo menos uma vez, depois testa a condição:

```java
int x = 0;
do {
    System.out.println(x);
    x++;
} while (x < 5);
```

### For-Each
Percorre elementos de arrays e coleções:

```java
int[] numeros = {1, 2, 3};
for (int n : numeros) {
    System.out.println(n);
}
```

---
# Orientação a Objetos (OO)
A **Orientação a Objetos (OO)** é um paradigma de programação que organiza o código em **objetos**, que representam entidades do mundo real ou conceitos abstratos.  
Cada objeto combina **dados** (atributos) e **comportamentos** (métodos), facilitando a reutilização, a manutenção e a escalabilidade do software.

## Conceitos Fundamentais

### Classe
- É o **molde** ou **modelo** para criar objetos.
- Define os **atributos** (características) e **métodos** (ações) que os objetos terão.

```java
class Carro {
    String cor;
    int ano;

    void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}
```

### Objeto

- É uma instância de uma classe.
- Cada objeto tem seus próprios valores de atributos.

```java
Carro carro1 = new Carro();
carro1.cor = "Vermelho";
carro1.ano = 2020;

Carro carro2 = new Carro();
carro2.cor = "Preto";
carro2.ano = 2022;
```

### Interfaces
- É um contrato que define um conjunto de métodos que uma classe deve implementar.
- Uma classe pode implementar várias interfaces, superando a limitação da herança simples.
- Não pode ser instanciada (é uma classe de métodos abstratos)

```java
interface Volante {
    void girarEsquerda();
    void girarDireita();
}

class Carro implements Volante {
    public void girarEsquerda() {
        System.out.println("Carro virou à esquerda.");
    }

    public void girarDireita() {
        System.out.println("Carro virou à direita.");
    }
}
```

### Pilares da Orientação a Objetos

#### Abstração
- Representa apenas as informações essenciais de um objeto, escondendo detalhes desnecessários. Foca no que um objeto faz, e não em como ele faz.

```java
interface ControleRemoto {
    void ligar();
    void desligar();
}
```
```java
abstract class Animal {
    void emitirSom();
}
```
- não podem ser instanciadas

#### Encapsulamento
- Protege os detalhes internos de um objeto.
- O acesso aos atributos deve ser feito através de getters e setters, controlando como os dados podem ser manipulados.

```java
class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

#### Herança
- Permite que uma classe herde atributos e métodos de outra.
- Promove reutilização de código e hierarquia entre classes.
- Define uma relação "é-um" (exemplo: um Cachorro é um Animal).

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido");
    }
}
```

#### Polimorfismo
- Permite que um mesmo método tenha múltiplos comportamentos.
- O método executado depende do tipo do objeto em tempo de execução.

```java
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.emitirSom(); // "Latido"
a2.emitirSom(); // "Miau"

// Cachorro e Gato podem ter outros métodos próprios, mas a partir de uma variavel
// de Animal ele só pode usar os métodos genéricos da classe
```

#### Sobreescrita
Sobrescrita (ou method overriding) acontece quando uma subclasse fornece uma nova implementação para um método herdado da superclasse ou de uma interface.

- O método deve ter a mesma assinatura (nome, parâmetros e tipo de retorno compatível).

- O acesso não pode ser mais restritivo que o método original.

- @Override para garantir que está realmente sobrescrevendo. (opcional)

#### Sobrecarga
Sobrecarga de métodos (method overloading) acontece quando dois ou mais métodos têm o mesmo nome, mas diferem na assinatura (quantidade, tipos ou ordem dos parâmetros).

- Pode estar na mesma classe ou em uma classe filha.

- O tipo de retorno pode ser diferente, mas isso não é suficiente para diferenciar métodos (precisa mudar os parâmetros).

- É resolvida em tempo de compilação (compile-time polymorphism).

#### Sealed Classes (Java 17+)
- As **sealed classes** permitem **controlar quais classes podem estender outra classe**.  
Elas foram introduzidas no Java 17 para dar mais **segurança**, **clareza** e **controle** em hierarquias de classes.

- Sem o `sealed`, qualquer classe poderia ser estendida livremente. Com ele, você define **quem pode herdar** e o compilador garante essa restrição.

##### `sealed`
- Usada para declarar uma classe **selada**, ou seja, que **só pode ser herdada** pelas classes explicitamente listadas.
- Junto dela, usamos a cláusula **`permits`** para dizer quais classes estão autorizadas.

```java
sealed class Forma permits Circulo, Retangulo, Triangulo { }

final class Circulo extends Forma { }
final class Retangulo extends Forma { }
final class Triangulo extends Forma { }
```

##### final
- Quando usada em uma subclasse de uma sealed class, significa que essa subclasse não pode ser estendida.
```java
sealed class Veiculo permits Carro, Moto { }

final class Carro extends Veiculo { } // não pode ser herdada
final class Moto extends Veiculo { }  // não pode ser herdada
```

##### non-sealed
- Remove a restrição do sealed, permitindo que qualquer classe herde daquela subclasse.
- É útil quando você quer que apenas um ponto da hierarquia seja flexível.
```java
sealed class Forma permits Circulo, Retangulo { }

final class Circulo extends Forma { } // fechado
non-sealed class Retangulo extends Forma { } // aberto

```
### Quando usar Herança, Interface?
- Herança: quando existe uma relação clara de "é-um" e você quer reaproveitar código.

- Interface: quando você precisa definir um contrato comum entre classes de naturezas diferentes.

#### Exemplo de comparação prática:

- Animal pode ser uma classe base.

- Corredor pode ser uma interface que Cachorro e Cavalo implementam.

### Benefícios da Orientação a Objetos

- Reutilização de código.

- Organização que reflete o mundo real.

- Manutenção facilitada.

- Escalabilidade para sistemas grandes.

- Flexibilidade com interfaces.

- Controle com sealed classes, evitando hierarquias descontroladas.

### modificadores: 
- public - visivel para todos em qualquer lugar
- private - visivel so na classe
- protected - visivel no pacote e publico para filhos (independente do pacote)
- package (default - quando n tem nada na frente) - visivel no pacote
- static - pertence a classe
- abstract - torna a classe/método abstrato (não tem implementação) - para classes impede que elas sejam instanciadas
- final - algo imutável

### Object
Em Java, todas as classes herdam implicitamente da classe base `java.lang.Object`. Essa classe fornece métodos fundamentais que podem ser sobrescritos para controlar o comportamento do seu objeto, sendo os principais:

- `toString()`
- `equals(Object obj)`
- `hashCode()`

#### `toString()`
- Propósito: Retornar uma representação textual do objeto, útil para debug e logs.
- Boa prática: Retornar informações significativas do objeto, evitando expor dados sensíveis.

Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               '}';
    }
}
```

#### `equals(Object obj)`
- Propósito: Comparar se dois objetos são “semânticamente iguais”.
- Boa prática: Sobrescreva sempre que a igualdade lógica do seu objeto não for apenas por referência (==) - lembrando que variaveis de referencia guardam apenas apontam para o objeto e não guardam o objeto em si.

Exemplo:

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoa pessoa = (Pessoa) obj;
    return idade == pessoa.idade && nome.equals(pessoa.nome);
}
```

#### `hashCode()`
- Propósito: Gerar um valor inteiro baseado nos atributos do objeto, usado em coleções como HashMap e HashSet.
- Regra importante: Sempre que sobrescrever equals(), também sobrescreva hashCode().
- Boa prática: Usar todos os campos que definem a igualdade do objeto.

Exemplo:

```java
@Override
public int hashCode() {
    return Objects.hash(nome, idade);
}
```
