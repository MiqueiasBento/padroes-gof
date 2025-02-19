package Pedido;

import frete.Frete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Frete frete;
    private List<Item> itens;

    public Pedido(Frete frete) {
        this.frete = frete;
        this.itens = new ArrayList<>();
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total + frete.calcularFrete(this);
    }

    public double calcularPesoTotal() {
        Double pesoTotal = 0.0;
        for (Item item : itens) {
            pesoTotal += item.getPeso();
        }
        return pesoTotal;
    }
}
