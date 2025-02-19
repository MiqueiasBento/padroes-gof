package sanduiche.decoradores;

import sanduiche.Sanduiche;

// Classe abstrata base
public class SanduicheDecorador implements Sanduiche {
    protected Sanduiche sanduiche;

    public SanduicheDecorador(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche();
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche();
    }
}
