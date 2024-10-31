
# 📚 Biblioteca de Gerenciamento de Acervo

Sistema desenvolvido em **Java (JDK 17)** para gerenciar o acervo de uma biblioteca. Este projeto permite o **armazenamento**, **organização** e **busca** de livros, otimizando a gestão com funcionalidades intuitivas.

## 🚀 Funcionalidades

- **Armazenamento** de dados dos livros no sistema
- **Organização** do acervo para facilitar a consulta
- **Busca** eficiente de livros

## 📋 Especificações do Projeto

### Estrutura de Dados

- Utiliza uma **lista sequencial** para armazenar objetos que representam os livros, com os seguintes atributos:
  - **Título** do livro
  - **Autor**
  - **Ano de Publicação**

### 🔄 Algoritmo de Ordenação

- **Bubble Sort**: Implementado para ordenar os livros por **título** ou **autor**, tornando a consulta mais eficiente e organizada.

### 💻 Interface

- **Linha de Comando (CLI)** ou **Interface Gráfica (UI)** (dependendo da escolha de implementação):
  - **Adicionar** livros ao acervo
  - **Listar** todos os livros
  - **Ordenar** por título ou autor
  - **Buscar** um livro específico

## 🛠️ Pré-requisitos

- **Java JDK 17**: Certifique-se de ter o JDK 17 instalado para executar este projeto.
- **IDE recomendada**: [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/)

## 🚀 Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/biblioteca-acervo.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd biblioteca-acervo
   ```

3. Compile o código:

   ```bash
   javac src/*.java
   ```

4. Execute o sistema:

   ```bash
   java src.Main
   ```

## 📖 Exemplos de Uso

- **Adicionar Livro**: Digite o título, autor e ano de publicação para armazenar um novo livro.
- **Listar Livros**: Visualize todos os livros disponíveis no acervo.
- **Ordenar Livros**: Ordene os livros por título ou autor usando o Bubble Sort.
- **Buscar Livro**: Encontre um livro específico pelo título.

## 📌 Notas Técnicas

- **Estrutura**: Utiliza uma lista sequencial, ideal para manipulações simples de armazenamento e recuperação.
- **Ordenação**: Bubble Sort foi escolhido por sua simplicidade e pelo objetivo de ilustrar um algoritmo básico de ordenação.

## 🔧 Melhorias Futuras

- Implementação de novos algoritmos de busca.
- Expansão da interface com uma opção de **UI gráfica**.
- Possibilidade de persistência dos dados.

## 📜 Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

## ✨ Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou enviar uma issue com sugestões.

**Desenvolvido por [Seu Nome]** 🚀
