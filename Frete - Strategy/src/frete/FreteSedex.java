package frete;

import Pedido.Pedido;

public class FreteSedex implements Frete {
    private static final double precoPeso = 2.0;

    @Override
    public double calcularFrete(Pedido pedido) {
        return precoPeso * pedido.calcularPesoTotal();
    }
}
