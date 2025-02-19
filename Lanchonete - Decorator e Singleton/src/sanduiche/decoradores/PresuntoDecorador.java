package sanduiche.decoradores;

import sanduiche.Sanduiche;

public class PresuntoDecorador extends SanduicheDecorador {

    public PresuntoDecorador(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche() + ", Presunto";
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche() + 1.00;
    }
}
