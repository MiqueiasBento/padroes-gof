package decoradores;

import componente.Sanduiche;

public class DecoradorAlface extends DecoradorSanduiche {

    public DecoradorAlface(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Alface";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 0.50;
    }
}
