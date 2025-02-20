package factory;

import hamburguer.Hamburguer;
import hamburguer.Ingrediente;

public class HamburguerVegano extends Hamburguer {

    public HamburguerVegano() {
        super("Hamburguer Vegano");
        super.getIngredientes().add(new Ingrediente("pao integral", 1.0));
        super.getIngredientes().add(new Ingrediente("hamburguer de grao-de-bico", 2.5));
        super.getIngredientes().add(new Ingrediente("alface", 1.0));
        super.getIngredientes().add(new Ingrediente("tomate", 1.0));
    }
}
