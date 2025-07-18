package CadastroAlunos;

// Criação da classe Aluno.
public class Aluno {
    
     // Esses são os atributos privados do aluno (não acessáveis diretamente fora da classe).
    private String nome;
    private int idade;
    private String matricula;

//  Esse é o construtor da classe.
//  Sempre que você cria um novo aluno (new Aluno(...)), ele é obrigado a passar o nome, idade e matrícula.
    public Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Esses são os getters — métodos públicos que servem pra acessar os atributos privados.
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getMatricula(){
        return matricula;
    }

    // Esse método faz com que, ao imprimir um aluno (System.out.println(aluno)), apareça algo legível, como:
   @Override

   public String toString(){
    return "Nome : " + nome + ", Idade : " + idade + ", Matricula : " + matricula;
   }
}
