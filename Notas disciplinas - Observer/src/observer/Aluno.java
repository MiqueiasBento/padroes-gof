package observer;

public class Aluno implements Observer {
    private String nome;

    public Aluno(String nome) {
        this.setNome(nome);
    }

    public void update(Disciplina disciplina) {
        System.out.println("Aluno " + this.getNome() + " recebeu a nota " + disciplina.getNota(nome));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
