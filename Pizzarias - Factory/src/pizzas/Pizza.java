package pizzas;

public abstract class Pizza {
    private String pizzaria;
    private SaborPizza sabor;
    private double preco;

    public Pizza(String pizzaria, SaborPizza sabor, double preco) {
        this.pizzaria = pizzaria;
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getPizzaria() {
        return pizzaria;
    }

    public void setPizzaria(String pizzaria) {
        this.pizzaria = pizzaria;
    }

    public SaborPizza getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setSabor(SaborPizza sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pizza { " + '\n' +
                " pizzaria='" + pizzaria + '\n' +
                " sabor=" + sabor + '\n' +
                " preco=" + preco + '\n' +
                '}';
    }
}
