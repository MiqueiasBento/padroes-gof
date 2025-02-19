package observer;

public class Coordenadora implements Observer {
    private String nome;

    public Coordenadora(String nome) {
        this.setNome(nome);
    }

    @Override
    public void update(Disciplina disciplina) {
        System.out.println("Coordenadora " + getNome() + ": houve alteração de nota em " + disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
