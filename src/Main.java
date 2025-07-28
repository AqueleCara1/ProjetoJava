import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            if (escolha == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                tarefas.add(new Tarefa(titulo, descricao));
                System.out.println("Tarefa adicionada!");
            } else if (escolha == 2) {
                System.out.println("\nLista de tarefas:");
                for (Tarefa t : tarefas) {
                    t.exibir();
                    System.out.println("---------------");
                }
            } else if (escolha == 3) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
