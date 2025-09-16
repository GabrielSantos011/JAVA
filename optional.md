# Optional

## O que é Optional?
`Optional<T>` é uma classe introduzida no **Java 8** no pacote `java.util`.  
Ela é usada para **representar valores que podem ou não estar presentes**, ajudando a evitar o famoso **NullPointerException**.

Em vez de retornar `null`, métodos podem retornar um `Optional` que **indica claramente** a possibilidade de ausência de valor.

---

## Principais Objetivos
- Reduzir o uso de `null`.
- Deixar o código mais legível e seguro.
- Indicar explicitamente que um valor pode estar ausente.
- Fornecer métodos utilitários para lidar com valores opcionais.

---

## Criação de Optionals

```java
import java.util.Optional;

public class OptionalExemplo {
    public static void main(String[] args) {
        // Cria um Optional com valor presente
        Optional<String> nome = Optional.of("Gabriel");

        // Cria um Optional vazio
        Optional<String> vazio = Optional.empty();

        // Cria um Optional que aceita nulos
        Optional<String> talvezNulo = Optional.ofNullable(null);
    }
}
```

## Métodos Principais

Verificação de Presença
```java
Optional<String> opt = Optional.of("Java");

// Verifica se há valor
if (opt.isPresent()) {
    System.out.println("Valor presente: " + opt.get());
}

// Executa ação caso presente
opt.ifPresent(valor -> System.out.println("Valor: " + valor));
```

## Recuperando Valores
```java
Optional<String> vazio = Optional.empty();

// get() - retorna o valor, mas lança NoSuchElementException se vazio
// String valor = vazio.get(); // ERRO

// orElse - retorna valor padrão se vazio
String v1 = vazio.orElse("Padrão");

// orElseGet - retorna valor de um Supplier
String v2 = vazio.orElseGet(() -> "Gerado");

// orElseThrow - lança exceção customizada se vazio
String v3 = vazio.orElseThrow(() -> new IllegalArgumentException("Valor ausente"));
```

Transformações
```java
Optional<String> nome = Optional.of("Gabriel");

// map - aplica função se valor presente
Optional<Integer> tamanho = nome.map(String::length);

// flatMap - similar ao map, mas evita Optional aninhado
Optional<String> resultado = nome.flatMap(n -> Optional.of(n.toUpperCase()));

// filter - mantém valor somente se a condição for verdadeira
Optional<String> filtrado = nome.filter(n -> n.startsWith("G"));
```

## Exemplos Práticos

Exemplo 1 - Retorno de Busca
```java
import java.util.*;

class RepositorioUsuarios {
    private List<String> usuarios = Arrays.asList("Daniela", "Carlos", "Gabriel");

    public Optional<String> buscarUsuario(String nome) {
        return usuarios.stream()
                       .filter(u -> u.equalsIgnoreCase(nome))
                       .findFirst();
    }
}

public class Teste {
    public static void main(String[] args) {
        RepositorioUsuarios repo = new RepositorioUsuarios();

        Optional<String> usuario = repo.buscarUsuario("Carlos");

        usuario.ifPresentOrElse(
            u -> System.out.println("Encontrado: " + u),
            () -> System.out.println("Usuário não encontrado")
        );
    }
}
```

Exemplo 2 - Evitando NullPointerException
```java
class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

public class Exemplo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", null);

        // Sem Optional -> risco de NPE
        // System.out.println(p1.getEmail().toUpperCase());

        // Com Optional
        String email = p1.getEmail()
                         .orElse("sem-email@dominio.com");

        System.out.println("Email: " + email);
    }
}
```

