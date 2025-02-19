package metodosPagamento;

import strategy.MetodoPagamento;

public class PagamentoBoleto implements MetodoPagamento {

    public PagamentoBoleto() {
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " via Boleto");
    }
}
