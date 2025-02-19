package frete;

import Pedido.Pedido;

public class FretePAC implements Frete {
    private static final double precoFixo = 10.0;

    @Override
    public double calcularFrete(Pedido pedido) {
        return precoFixo;
    }
}
