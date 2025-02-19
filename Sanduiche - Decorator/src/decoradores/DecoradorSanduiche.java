package decoradores;

import componente.Sanduiche;

// É a classe abstrata que também implementa a interface Sandwich e
// mantém uma referência para outro objeto Sandwich que será decorado.
// Ela delega as chamadas para esse objeto.
public class DecoradorSanduiche implements Sanduiche {
    protected Sanduiche sanduiche;

    public DecoradorSanduiche(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }


    @Override
    public String getDescricao() {
        return sanduiche.getDescricao();
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco();
    }
}
