package padaria;

public class Cliente implements Subscriber {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(getNome() + " recebeu a notificação: " + mensagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
