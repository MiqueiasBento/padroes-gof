package hamburguer;

public class HamburguerDuplo extends Hamburguer {

    public HamburguerDuplo() {
        super("Hamburguer Duplo");
        super.getIngredientes().add(new Ingrediente("pao", 1.0));
        super.getIngredientes().add(new Ingrediente("carne", 2.0));
        super.getIngredientes().add(new Ingrediente("queijo", 1.0));
    }
}
