package fabrica;

import pizzas.*;
import pizzas.nori.PizzaCalabresaNori;
import pizzas.nori.PizzaMargueritaNori;
import pizzas.nori.PizzaMussarelaNori;
import pizzas.nori.PizzaPortuguesaNori;

public class PizzariaNoriFactory implements Factory {

    @Override
    public Pizza criarPizza(String sabor) {
        switch (sabor) {
            case "MUSSARELA":
                return new PizzaMussarelaNori();
            case "CALABRESA":
                return new PizzaCalabresaNori();
            case "MARGUERITA":
                return new PizzaMargueritaNori();
            case "PORTUGUESA":
                return new PizzaPortuguesaNori();
            default:
                return null;
        }
    }
}
