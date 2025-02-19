import metodosPagamento.PagamentoBoleto;
import metodosPagamento.PagamentoCartaoCredito;
import metodosPagamento.PagamentoPix;
import strategy.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        // Pagamento com Cartão de Crédito
        sistema.setMetodoPagamento(new PagamentoCartaoCredito());
        sistema.processarPagamento(100.0);

        // Pagamento com Pix
        sistema.setMetodoPagamento(new PagamentoPix());
        sistema.processarPagamento(50.0);

        // Pagamento com Boleto
        sistema.setMetodoPagamento(new PagamentoBoleto());
        sistema.processarPagamento(200.0);
    }
}