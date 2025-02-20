package fabrica;

import pizzas.*;
import pizzas.trinta_e_cinco.PizzaCalabresa35;
import pizzas.trinta_e_cinco.PizzaMarguerita35;
import pizzas.trinta_e_cinco.PizzaMussarela35;
import pizzas.trinta_e_cinco.PizzaPortuguesa35;

public class Pizzaria35Factory implements Factory {

    @Override
    public Pizza criarPizza(String sabor) {
        switch (sabor) {
            case "MUSSARELA":
                return new PizzaMussarela35();
            case "CALABRESA":
                return new PizzaCalabresa35();
            case "MARGUERITA":
                return new PizzaMarguerita35();
            case "PORTUGUESA":
                return new PizzaPortuguesa35();
            default:
                return null;
        }
    }
}
