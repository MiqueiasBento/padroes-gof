package metodosPagamento;

import strategy.MetodoPagamento;

public class PagamentoCartaoCredito implements MetodoPagamento {

    public PagamentoCartaoCredito() {
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " via Cartão de Crédito");
    }
}
