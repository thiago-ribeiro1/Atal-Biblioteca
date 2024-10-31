import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SequentialList lista = new SequentialList(5); // Inicializando com capacidade inicial
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro (pelo índice)");
            System.out.println("3 - Buscar livro (pelo título)");
            System.out.println("4 - Mostrar todos os livros");
            System.out.println("5 - Ordenar livros por título e autor");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento (AAAA-MM-DD): ");
                    LocalDateTime anoLancamento = LocalDateTime.parse(scanner.nextLine() + "T00:00:00");
                    Book livro = new Book(autor, titulo, LocalDateTime.now(), anoLancamento);
                    lista.adicionar(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice do livro a ser removido: ");
                    int indice = scanner.nextInt();
                    lista.remover(indice);
                    break;
                case 3:
                    System.out.print("Digite o título do livro para buscar: ");
                    String tituloBusca = scanner.nextLine();
                    int indiceEncontrado = lista.buscar(tituloBusca);
                    if (indiceEncontrado != -1) {
                        System.out.println("Livro encontrado: " + lista.getLivro(indiceEncontrado));
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    lista.mostrarLista();
                    break;
                case 5:
                    System.out.println("Ordenando lista por título e autor...");
                    lista.ordenarPorTituloEAutor();
                    System.out.println("Lista ordenada com sucesso.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}
