package factory;

import hamburguer.Hamburguer;
import hamburguer.HamburguerBuilder;
import hamburguer.Ingrediente;

public class HamburguerPersonalizado implements HamburguerBuilder {
    private Hamburguer hamburguer;

    @Override
    public HamburguerBuilder adicionarBase(Hamburguer base) {
        this.hamburguer = base;
        return this;
    }

    @Override
    public HamburguerBuilder adicionarIngrediente(Ingrediente ingrediente) {
        this.hamburguer.addIngredientes(ingrediente);
        return this;
    }

    @Override
    public Hamburguer build() {
        return hamburguer;
    }
}
