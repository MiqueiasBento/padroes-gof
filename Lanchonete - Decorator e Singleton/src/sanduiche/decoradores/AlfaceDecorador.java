package sanduiche.decoradores;

import sanduiche.Sanduiche;

public class AlfaceDecorador extends SanduicheDecorador {

    public AlfaceDecorador(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche() + ", Alface";
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche() + 0.35;
    }
}
