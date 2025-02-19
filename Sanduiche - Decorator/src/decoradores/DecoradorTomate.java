package decoradores;

import componente.Sanduiche;

public class DecoradorTomate extends DecoradorSanduiche {
    public DecoradorTomate(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Tomate";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 0.75;
    }
}
