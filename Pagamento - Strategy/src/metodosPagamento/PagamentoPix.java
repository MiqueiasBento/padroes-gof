package metodosPagamento;

import strategy.MetodoPagamento;

public class PagamentoPix implements MetodoPagamento {

    public PagamentoPix() {
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " via Pix");
    }
}
