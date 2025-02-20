import fabrica.*;
import pizzas.Pizza;

import java.util.Scanner;

public class PizzariaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factory factory = null;

        // Escolha da pizzaria e sabor
        System.out.print("Escolha a pizzaria: ");
        String pizzaria = sc.nextLine();
        System.out.print("Sabor: ");
        String sabor = sc.nextLine();

        if ("Nori".equalsIgnoreCase(pizzaria)) {
            factory = new PizzariaNoriFactory();
        } else if ("35".equalsIgnoreCase(pizzaria)) {
            factory = new Pizzaria35Factory();
        }

        // Criacao da pizza
        assert factory != null;
        Pizza pizza = factory.criarPizza(sabor.toUpperCase());

        System.out.println("Pedido: " + pizza);
    }
}
