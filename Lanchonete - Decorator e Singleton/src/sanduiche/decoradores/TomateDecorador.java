package sanduiche.decoradores;

import sanduiche.Sanduiche;

public class TomateDecorador extends SanduicheDecorador {

    public TomateDecorador(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche() + ", Tomate";
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche() + 0.75;
    }
}
