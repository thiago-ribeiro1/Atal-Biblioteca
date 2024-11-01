
# 📚 Biblioteca Atal (Análise e Técnicas de Algoritmos)

# Documentação

- **Estrutura de Dados Escolhida**

Usamos um array dinâmico para guardar os livros na lista, que é basicamente uma estrutura que cresce automaticamente conforme novos livros são adicionados. No início, a lista começa com um tamanho que escolhemos (definido quando a SequentialList é criada), com capacidade inicial de 5 elementos. Quando ela fica cheia, a capacidade dobra, permitindo que a lista armazene mais livros sem limite fixo.

Essa escolha é boa para guardar itens em sequência e facilita operações como busca, adição e remoção de elementos, o que funciona bem para uma lista de livros que não muda o tempo todo. Um array dinâmico como esse é eficiente para acessar e buscar itens na ordem em que foram adicionados, mas pode ser menos eficiente para inserções e remoções frequentes em posições aleatórias da lista.

- **Explicação sobre o Algoritmo de Ordenação**
  
No método ordenarPorTituloEAutor(), usamos o Bubble Sort para organizar os livros, primeiro pelo título e, se dois títulos forem iguais, pelo nome do autor. Esse algoritmo é simples: ele percorre a lista várias vezes, trocando a posição de dois livros vizinhos sempre que eles estão na ordem errada. Esse processo continua até que a lista esteja completamente organizada e nenhuma troca adicional seja necessária.

O Bubble Sort pode não ser o mais rápido para listas muito grandes, mas ele pode ser fácil de implementar e funciona bem para listas pequenas ou médias, como essa. A verificação com trocou ajuda a interromper o processo mais cedo, se possível, evitando voltas desnecessárias caso a lista já esteja ordenada antes do fim do processo.

A complexidade do Bubble Sort é O(n²) no pior e no caso médio, devido às várias passagens pela lista e à comparação de cada par de elementos.

<br>

## Aplicação

Sistema desenvolvido em Java (JDK 17) para gerenciar o acervo de uma biblioteca. Este projeto permite o armazenamento, organização, busca e remoção de livros.

## ✨ Funcionalidades

- Armazenamento de dados dos livros no sistema
- Ordenação de livros
- Busca de livros
- Remoção de livros

## 🛠️ Especificações do Projeto

### Estrutura de Dados

- Utiliza uma **lista sequencial** para armazenar objetos que representam os livros, com os seguintes atributos:
  - **Título**
  - **Autor**
  - **Ano de Publicação**

### Algoritmo de Ordenação

- **Bubble Sort**: Implementado para ordenar os livros por **título** e **autor**.

### Interface

- Adicionar livros
- Listar todos os livros
- Ordenar por título e autor
- Buscar um livro específico pelo título
- Remover um livro pelo índice

## ⚙️ Pré-requisitos

- **Java JDK 17**: Certifique-se de ter o JDK 17 instalado para executar este projeto.
- **IDE recomendada**: [IntelliJ IDEA](https://www.jetbrains.com/idea/)
