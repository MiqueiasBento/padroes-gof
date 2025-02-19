package Pedido;

public class Item {
    private String descricao;
    private double peso;
    private double valor;

    public Item(String descricao, double peso, double valor) {
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
