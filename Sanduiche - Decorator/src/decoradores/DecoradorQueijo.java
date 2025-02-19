package decoradores;

import componente.Sanduiche;

// Cada ingrediente é um decorador concreto que acrescenta algo à descrição e ao custo.
public class DecoradorQueijo extends DecoradorSanduiche {
    public DecoradorQueijo(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Queijo";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 1.50;
    }
}
