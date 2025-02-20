package hamburguer;

import java.util.ArrayList;
import java.util.List;

public abstract class Hamburguer {
    private String nome;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private double preco;

    public Hamburguer(String nome) {
        this.nome = nome;
    }

    public void calcularPreco() {
        this.preco = 0;
        for (Ingrediente ingrediente : ingredientes) {
            preco += ingrediente.getPreco();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void addIngredientes(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Hamburguer{" + '\n' +
                " nome: " + nome + '\n' +
                " ingredientes: " + ingredientes + '\n' +
                " preco: " + preco + '\n' +
                '}';
    }
}
