# Projeto de Estudo - Explorando Recursos Avançados em Java

Este projeto tem como objetivo demonstrar o uso de diversas funcionalidades da linguagem Java, incluindo manipulação de listas, casting, herança, interfaces, e operações com classes de domínio.

## Funcionalidades Principais

1. **Manipulação de ArrayList:**
    - Exemplo prático de como adicionar e iterar sobre uma lista de nomes.

2. **Uso de Casting e `instanceof`:**
    - Demonstra como verificar o tipo de um objeto e realizar casting seguro.

3. **Cálculo de Preço Médio:**
    - Utilização de um loop para calcular o preço médio de produtos armazenados em uma lista.

4. **Implementação de Interface:**
    - Demonstração do cálculo de áreas de formas geométricas por meio de uma interface `Forma`.

5. **Operações Bancárias com ArrayList:**
    - Encontrar a conta bancária com maior saldo em uma lista de contas.

## Estrutura do Projeto

### Pacotes

- **`alura.practice.application`**
    - Contém a classe principal `App`, responsável pela execução do projeto.

- **`alura.practice.model`**
    - Contém classes de domínio como `Animal`, `Cachorro`, `Produto`, `ContaBancaria`, `Circulo` e `Quadrado`.

- **`alura.practice.service`**
    - Define a interface `Forma`, usada para cálculo de áreas.

### Classes

- **`App`**
    - Classe principal que executa os exemplos práticos abordados no projeto.

- **`Animal`**
    - Representa um animal com um atributo `raça` e permite a especialização por meio da classe `Cachorro`.

- **`Cachorro`**
    - Especialização de `Animal` com um método específico `emiteSom`.

- **`Produto`**
    - Representa um item genérico com atributos como `nome` e `preço`.

- **`ContaBancaria`**
    - Simula uma conta bancária com operações básicas de depósito.

- **`Quadrado` e `Circulo`**
    - Implementações da interface `Forma`, responsáveis por calcular a área de figuras geométricas.

### Interface

- **`Forma`**
    - Define um método `calculoArea()` para cálculo de áreas, implementado pelas classes `Quadrado` e `Circulo`.

## Exemplos de Funcionalidades

1. **Manipulação de Lista:**
    ```java
    ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Lucas", "Danyelle", "Jose", "Maria"));
    nomes.forEach(System.out::println);
    ```

2. **Casting e `instanceof`:**
    ```java
    Animal poodle = new Cachorro("Poodle");
    if (poodle instanceof Cachorro) {
        ((Cachorro) poodle).emiteSom();
    }
    ```

3. **Cálculo de Preço Médio:**
    ```java
    double precoMedio = produtos.stream().mapToDouble(Produto::getPreco).average().orElse(0);
    System.out.println("Preço médio: " + precoMedio);
    ```

4. **Cálculo de Áreas:**
    ```java
    ArrayList<Forma> formas = new ArrayList<>(Arrays.asList(new Quadrado(5), new Circulo(2)));
    formas.forEach(forma -> System.out.println(forma.calculoArea()));
    ```

5. **Encontrar Conta com Maior Saldo:**
    ```java
    ContaBancaria maiorSaldo = contas.stream().max(Comparator.comparingDouble(ContaBancaria::getSaldo)).orElse(null);
    ```

## Como Executar o Projeto

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/seuusuario/projeto-java-estudo.git
   ```

2. **Configure o ambiente**:
- Certifique-se de ter o **Java 8 ou superior** instalado.

3. **Compile e execute**:
- Compile e execute a classe `App` para explorar as funcionalidades implementadas.

## Tecnologias Utilizadas
- **Java 8 ou superior**
- **Paradigma Orientado a Objetos**

## Autor
- Lucas Degrande