package sanduiche.decoradores;

import sanduiche.Sanduiche;
import sanduiche.SanduicheSimples;

public class QueijoDecorador extends SanduicheDecorador {

    public QueijoDecorador(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche() + ", Queijo";
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche() + 1.50;
    }
}
