public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluido;

    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluido = false;
    }

    public void marcarConcluido(){
        concluido = true;
    }

    public void exibir(){
        System.out.println("Título: " + titulo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Status: " + (concluido ? "Concluida" : "Pendente"));
    }
}