package hamburguer;

public interface HamburguerBuilder {
    public HamburguerBuilder adicionarBase(Hamburguer base);
    public HamburguerBuilder adicionarIngrediente(Ingrediente ingrediente);
    public Hamburguer build();
}
