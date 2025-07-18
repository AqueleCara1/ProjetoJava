package CadastroAlunos;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        // Carrega alunos do arquivo ao iniciar
        carregarAlunos(listaAlunos);

        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro de Alunos ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar por matrícula");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();

                    listaAlunos.add(new Aluno(nome, idade, matricula));
                    salvarAlunos(listaAlunos);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : listaAlunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite a matrícula: ");
                    String busca = scanner.nextLine();
                    boolean achou = false;
                    for (Aluno a : listaAlunos) {
                        if (a.getMatricula().equals(busca)) {
                            System.out.println("Aluno encontrado: " + a);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) System.out.println("Aluno não encontrado.");
                    break;

                case 4:
                    System.out.print("Digite a matrícula para remover: ");
                    String remover = scanner.nextLine();
                    boolean removido = listaAlunos.removeIf(a -> a.getMatricula().equals(remover));
                    if (removido) {
                        salvarAlunos(listaAlunos);
                        System.out.println("Aluno removido com sucesso.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo... Valeu, Paizão!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void salvarAlunos(ArrayList<Aluno> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))) {
            for (Aluno a : lista) {
                writer.write(a.getNome() + ";" + a.getIdade() + ";" + a.getMatricula());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public static void carregarAlunos(ArrayList<Aluno> lista) {
        try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                String matricula = dados[2];
                lista.add(new Aluno(nome, idade, matricula));
            }
        } catch (FileNotFoundException e) {
            // Se o arquivo não existir ainda, tudo bem
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}

