# POO2

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos II.

## Objetivo

Este trabalho foi refatorado para demonstrar na prática os conceitos vistos em aula:

- classes abstratas;
- interfaces;
- uso de `ArrayList`;
- organização da aplicação no padrão MVC.

## O que foi feito

O projeto original concentrava a maior parte da lógica no arquivo principal. A refatoração reorganizou o código para separar responsabilidades e deixar a estrutura mais próxima de uma aplicação orientada a objetos.

### 1. Classe abstrata

A classe `Produto` foi transformada em abstrata. Ela agora representa a base comum dos produtos e concentra os atributos compartilhados:

- nome;
- preço;
- quantidade em estoque.

Além disso, ela define o contrato `mostrarDetalhes()`, que deve ser implementado pelas subclasses.

### 2. Subclasses de Produto

Foram mantidas duas especializações:

- `ProdutoNaoPerecivel`, que adiciona o atributo de garantia;
- `ProdutoPerecivel`, que adiciona a data de validade.

Cada uma sobrescreve `mostrarDetalhes()` para exibir seus próprios dados.

### 3. Interface

Foi criada a interface `DescontoQuantidade`, que define o método `calcularDesconto()`.

A classe `ProdutoPerecivel` implementa essa interface e calcula um desconto de 10% sobre o preço.

### 4. ArrayList

A coleção de produtos é controlada com `ArrayList`, permitindo armazenar diferentes tipos de produto na mesma lista.

O controller usa essa lista para:

- cadastrar produtos;
- listar produtos;
- buscar produtos pelo nome;
- repor estoque;
- realizar vendas.

### 5. MVC

A aplicação foi organizada em três partes:

- Model: `Produto`, `ProdutoNaoPerecivel` e `ProdutoPerecivel`;
- View: `ProdutoView` e `Menu`;
- Controller: `ProdutoController`.

Essa separação deixa o código mais fácil de entender, manter e expandir.

## Estrutura dos arquivos

- `Main.java` - ponto de entrada da aplicação;
- `Produto.java` - classe abstrata base;
- `ProdutoNaoPerecivel.java` - produto não perecível;
- `ProdutoPerecivel.java` - produto perecível;
- `DescontoQuantidade.java` - interface de desconto;
- `ProdutoController.java` - controle das operações;
- `ProdutoView.java` - exibição das informações;
- `Menu.java` - menu textual da aplicação.

## Como executar

Para compilar:

```bash
javac Main.java Produto.java ProdutoNaoPerecivel.java ProdutoPerecivel.java DescontoQuantidade.java ProdutoController.java Menu.java ProdutoView.java
```

Para executar:

```bash
java Main
```

## Observação

O projeto foi mantido em formato simples de console para facilitar a apresentação dos conceitos da aula. Se necessário, ele pode ser expandido depois para receber entrada do usuário com `Scanner` e tornar o menu interativo.
