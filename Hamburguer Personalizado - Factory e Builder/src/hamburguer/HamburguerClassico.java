package hamburguer;

import java.util.List;

public class HamburguerClassico extends Hamburguer {


    public HamburguerClassico() {
        super("Hamburguer Clasic");
            super.getIngredientes().add(new Ingrediente("pao", 1.0));
            super.getIngredientes().add(new Ingrediente("carne", 2.0));
            super.getIngredientes().add(new Ingrediente("queijo", 1.0));
    }
}
