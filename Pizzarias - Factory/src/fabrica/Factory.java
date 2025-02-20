package fabrica;

import pizzas.Pizza;

public interface Factory {
    public Pizza criarPizza(String sabor);
}
