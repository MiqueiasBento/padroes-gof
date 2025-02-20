import armas.Arma;

public class Guerreira {
    private String nome;
    private Arma arma;

    public Guerreira(String nome) {
        this.nome = nome;
    }

    public void escolherArma(Arma arma) {
        this.arma = arma;
    }

    public void ataque() {
        System.out.println(this.nome + " atacou inimigo causando " + this.arma.ataque() + " de dano.");
    }
}
