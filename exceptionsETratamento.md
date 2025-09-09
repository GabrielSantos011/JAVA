# Exceptions em Java

## O que são Exceptions?
Exceptions são eventos anormais que ocorrem durante a execução de um programa, interrompendo o fluxo normal das instruções.  
No Java, exceptions são **objetos** que representam esses eventos.

## Hierarquia de Exceptions
Todas as exceptions derivam da classe `Throwable`:

```
Throwable
 ├── Error
 └── Exception
      ├── RuntimeException
      └── (outras exceptions verificadas)
```

### Error
- Representa problemas graves do ambiente de execução (JVM).
- Normalmente não são tratados no código.
- Exemplos:  
  - `OutOfMemoryError`  
  - `StackOverflowError`  

### Exception
- Representa condições que podem ser tratadas pelo programa.
- Divide-se em:
  - **Checked Exceptions** (verificadas)  
    - O compilador exige tratamento.  
    - Ex: `IOException`, `SQLException`.
  - **Unchecked Exceptions** (runtime)  
    - Derivadas de `RuntimeException`.  
    - São erros de programação (bugs).  
    - Ex: `NullPointerException`, `ArithmeticException`.

## Tratamento de Exceptions

### Bloco try-catch
```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

### Bloco finally
Executa sempre, ocorrendo ou não exception:
```java
try {
    String texto = "Java";
    System.out.println(texto.charAt(10));
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Erro: " + e.getMessage());
} finally {
    System.out.println("Finalizando...");
}
```

### Multi-catch (Java 7+)
```java
try {
    String text = null;
    System.out.println(text.length());
} catch (NullPointerException | IllegalArgumentException e) {
    System.out.println("Erro: " + e);
}
```

## Try-with-Resources (Java 7+)
Usado para trabalhar com recursos que precisam ser fechados (ex.: arquivos, conexões, sockets).  
Qualquer classe que implemente `AutoCloseable` pode ser usada.

```java
try (FileReader fr = new FileReader("dados.txt");
     BufferedReader br = new BufferedReader(fr)) {
    String linha;
    while ((linha = br.readLine()) != null) {
        System.out.println(linha);
    }
} catch (IOException e) {
    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
}
// O recurso é fechado automaticamente ao sair do bloco try
```

Vantagem: não é necessário chamar `close()` manualmente no `finally`.

## Lançando Exceptions

### throw
Lança uma exception em tempo de execução.
```java
public void verificarIdade(int idade) {
    if (idade < 18) {
        throw new IllegalArgumentException("Idade deve ser maior ou igual a 18.");
    }
}
```

### throws
Indica que um método pode lançar uma exception (obrigatório em checked exceptions).
```java
public void lerArquivo(String caminho) throws IOException {
    FileReader fr = new FileReader(caminho);
}
```


## Criando uma Exception personalizada
```java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

### Uso:
```java
public void sacar(double valor) throws SaldoInsuficienteException {
    if (valor > saldo) {
        throw new SaldoInsuficienteException("Saldo insuficiente!");
    }
}
```
para unchecked extender de RuntimeException.