package sanduiche;

import sanduiche.decoradores.CarneDecorador;

public class SanduicheSimples implements Sanduiche {

    @Override
    public String montarSanduiche() {
        return "Pao frances";
    }

    @Override
    public double precoSanduiche() {
        return 0.50;
    }
}
