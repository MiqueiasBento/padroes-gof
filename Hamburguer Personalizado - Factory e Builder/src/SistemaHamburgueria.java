import factory.HamburguerPersonalizado;
import factory.HamburguerVegano;
import factory.HamburgueriaNobreFactory;
import hamburguer.Hamburguer;
import hamburguer.Ingrediente;

public class SistemaHamburgueria {
    public static void main(String[] args) {
        HamburgueriaNobreFactory hamburgueriaNobreFactory = new HamburgueriaNobreFactory();

        Hamburguer hamburguer = hamburgueriaNobreFactory.criarHamburguer("clasic");
        hamburguer.calcularPreco();
        System.out.println(hamburguer);

        Hamburguer personalizado = new HamburguerPersonalizado()
                .adicionarBase(new HamburguerVegano())
                .adicionarIngrediente(new Ingrediente("Cebola Caramelizada", 2.0))
                .adicionarIngrediente(new Ingrediente("Molho Especial", 2.0))
                .build();
        personalizado.calcularPreco();
        System.out.println(personalizado);
    }
}