package metodosPagamento;

import strategy.MetodoPagamento;

public class PagamentoCartaoDebito implements MetodoPagamento {

    public PagamentoCartaoDebito() {
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " via Cartão de Débito");
    }
}
