package sanduiche.decoradores;

import sanduiche.Sanduiche;

public class CarneDecorador extends SanduicheDecorador {

    public CarneDecorador(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montarSanduiche() {
        return sanduiche.montarSanduiche() + ", Carne";
    }

    @Override
    public double precoSanduiche() {
        return sanduiche.precoSanduiche() + 2.00;
    }
}
