package decoradores;

import componente.Sanduiche;

public class DecoradorPresunto extends DecoradorSanduiche {
    public DecoradorPresunto(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Presunto";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 1.50;
    }
}
